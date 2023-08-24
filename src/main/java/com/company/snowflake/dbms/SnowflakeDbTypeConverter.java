package com.company.snowflake.dbms;

import io.jmix.data.persistence.DbTypeConverter;
import org.springframework.stereotype.Component;

import javax.annotation.Nullable;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Date;
import java.util.UUID;

@Component("snowflakeDbTypeConverter")
public class SnowflakeDbTypeConverter implements DbTypeConverter {
    @Nullable
    @Override
    public Object getJavaObject(ResultSet resultSet, int columnIndex) {
        Object value;

        try {
            ResultSetMetaData metaData = resultSet.getMetaData();

            if ((columnIndex > metaData.getColumnCount()) || (columnIndex <= 0))
                throw new IndexOutOfBoundsException("Column index out of bound");

            value = resultSet.getObject(columnIndex);

            return value;
        } catch (SQLException e) {
            throw new RuntimeException("Error converting database value", e);
        }
    }

    @Override
    public Object getSqlObject(Object value) {
        return value;
    }

    @Override
    public int getSqlType(Class<?> javaClass) {
        if (javaClass == Date.class) {
            return Types.TIMESTAMP;
        } else if (javaClass == UUID.class) {
            return Types.VARCHAR;
        }
        return Types.OTHER;
    }

    @Override
    public String getTypeAndVersion() {
        return "snowflake";
    }
}
