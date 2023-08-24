package com.company.snowflake.dbms;

import io.jmix.data.persistence.SequenceSupport;
import org.springframework.stereotype.Component;

@Component("snowflakeSequenceSupport")
public class SnowflakeSequenceSupport implements SequenceSupport {
    @Override
    public String sequenceExistsSql(String sequenceName) {
        return "select sequence_name from information_schema.sequences " +
                "where sequence_catalog = CURRENT_DATABASE() and sequence_schema = CURRENT_SCHEMA() " +
                "and sequence_name = '" + sequenceName.toUpperCase() + "'";
    }

    @Override
    public String createSequenceSql(String sequenceName, long startValue, long increment) {
        return "create sequence " + sequenceName + " start with " + startValue + " increment by " + increment ;
    }

    @Override
    public String modifySequenceSql(String sequenceName, long startWith) {
        //todo: unable to reset - recreation is required. Increment is constant due to it's not provided
        return "create or replace sequence " + sequenceName + " start with " + startWith + " increment by 1";
    }

    @Override
    public String deleteSequenceSql(String sequenceName) {
        return "drop sequence " + sequenceName;
    }

    @Override
    public String getNextValueSql(String sequenceName) {
        return "select " + sequenceName + ".nextVal";
    }

    @Override
    public String getCurrentValueSql(String sequenceName) {
        return "select (next_value - 1)::number from information_schema.sequences " +
                "where sequence_catalog = CURRENT_DATABASE() and sequence_schema = CURRENT_SCHEMA() " +
                "and sequence_name = '" + sequenceName.toUpperCase() + "'";
    }
}
