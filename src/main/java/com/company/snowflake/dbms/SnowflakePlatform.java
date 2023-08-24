package com.company.snowflake.dbms;

import io.jmix.eclipselink.impl.dbms.String36UuidConverter;
import io.jmix.eclipselink.impl.dbms.UuidMappingInfo;
import org.eclipse.persistence.exceptions.ConversionException;
import org.eclipse.persistence.exceptions.ValidationException;
import org.eclipse.persistence.internal.databaseaccess.DatabaseCall;
import org.eclipse.persistence.internal.expressions.ExpressionSQLPrinter;
import org.eclipse.persistence.internal.expressions.SQLSelectStatement;
import org.eclipse.persistence.internal.sessions.AbstractSession;
import org.eclipse.persistence.mappings.converters.Converter;
import org.eclipse.persistence.platform.database.DatabasePlatform;
import org.eclipse.persistence.queries.ValueReadQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.Writer;
import java.sql.*;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.util.UUID;

public class SnowflakePlatform extends DatabasePlatform implements UuidMappingInfo {

    private static final Logger log = LoggerFactory.getLogger(SnowflakePlatform.class);

    private static final String LIMIT = " LIMIT ";
    private static final String OFFSET = " OFFSET ";

    @Override
    public int getUuidSqlType() {
        return Types.VARCHAR;
    }

    @Override
    public Class<?> getUuidType() {
        return String.class;
    }

    @Override
    public String getUuidColumnDefinition() {
        return "varchar(36)";
    }

    @Override
    public Converter getUuidConverter() {
        return String36UuidConverter.getInstance();
    }

    @Override
    public Object convertToDatabaseType(Object value) {
        return super.convertToDatabaseType(value);
    }

    @Override
    public Object convertObject(Object sourceObject, Class javaClass) throws ConversionException {
        return super.convertObject(sourceObject, javaClass);
    }


    @Override
    public boolean shouldOptimizeDataConversion() {
        //todo
        return false;
    }

    @Override
    public void setParameterValueInDatabaseCall(Object parameter, PreparedStatement statement, int index, AbstractSession session) throws SQLException {
        //todo issue with timezones
        if (parameter instanceof UUID) {
            parameter = convertToDataValueIfUUID(parameter);
        } else if (parameter instanceof Time) {
            parameter = parameter.toString();
        } else if (parameter instanceof LocalTime) {
            parameter = ((LocalTime) parameter).toString();
        } else if (parameter instanceof OffsetTime) {
            OffsetTime offsetTime = (OffsetTime) parameter;
            OffsetTime offsetTimeUtc = offsetTime.withOffsetSameInstant(ZoneOffset.UTC);
            LocalTime localTimeUtc = offsetTimeUtc.toLocalTime();
            parameter = localTimeUtc.toString();
        }

        super.setParameterValueInDatabaseCall(parameter, statement, index, session);
    }

    @Override
    public void setParameterValueInDatabaseCall(Object parameter, CallableStatement statement, String name, AbstractSession session) throws SQLException {
        super.setParameterValueInDatabaseCall(convertToDataValueIfUUID(parameter), statement, name, session);
    }

    @Override
    public boolean supportsIdentity() {
        return true;
    }

    @Override
    public boolean supportsSequenceObjects() {
        return true;
    }

    @Override
    public boolean isAlterSequenceObjectSupported() {
        return true;
    }

    @Override
    public ValueReadQuery buildSelectQueryForSequenceObject(String qualifiedSeqName, Integer size) {
        return new ValueReadQuery("SELECT " + qualifiedSeqName + ".NEXTVAL");
    }

    @Override
    public Writer buildSequenceObjectCreationWriter(Writer writer, String fullSeqName, int increment, int start) throws IOException {
        writer.write("CREATE SEQUENCE ");
        writer.write(fullSeqName);
        writer.write(" START WITH " + start);
        if (increment != 1) {
            writer.write(" INCREMENT BY " + increment);
        }
        return writer;
    }

    public void printFieldIdentityClause(Writer writer) throws ValidationException {
        try {
            writer.write(" IDENTITY");
        } catch (IOException ioException) {
            throw ValidationException.fileError(ioException);
        }
    }

    @Override
    public int computeMaxRowsForSQL(int firstResultIndex, int maxResults) {
        return maxResults - (Math.max(firstResultIndex, 0));
    }

    @Override
    public void printSQLSelectStatement(DatabaseCall call, ExpressionSQLPrinter printer, SQLSelectStatement statement) {
        int max = 0;
        if (statement.getQuery() != null) {
            max = statement.getQuery().getMaxRows();
        }
        if (max <= 0 || !(this.shouldUseRownumFiltering())) {
            super.printSQLSelectStatement(call, printer, statement);
            return;
        }
        statement.setUseUniqueFieldAliases(true);
        call.setFields(statement.printSQL(printer));
        printer.printString(LIMIT);
        printer.printParameter(DatabaseCall.MAXROW_FIELD);
        printer.printString(OFFSET);
        printer.printParameter(DatabaseCall.FIRSTRESULT_FIELD);
        call.setIgnoreFirstRowSetting(true);
        call.setIgnoreMaxResultsSetting(true);
    }

    public int getINClauseLimit() {
        return 16384;
    }
}
