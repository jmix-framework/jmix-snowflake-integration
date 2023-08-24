package com.company.snowflake.dbms;

import io.jmix.data.persistence.DbmsFeatures;
import org.springframework.stereotype.Component;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

@Component("snowflakeDbmsFeatures")
public class SnowflakeDbmsFeatures implements DbmsFeatures {
    @Override
    public Map<String, String> getJpaParameters() {
        HashMap<String, String> params = new HashMap<>();
        params.put("eclipselink.target-database", "com.company.snowflake.dbms.SnowflakePlatform");
        return params;
    }

    @Override
    public String getTimeStampType() {
        return "TIMESTAMP_TZ";
    }

    @Nullable
    @Override
    public String getUuidTypeClassName() {
        return null;
    }

    @Nullable
    @Override
    public String getTransactionTimeoutStatement() {
        return null;
    }

    @Override
    public String getUniqueConstraintViolationPattern() {
        /*
        Snowflake doesn't enforce unique\primary key constraint - not such kind of exception
         */
        return "^Unique constraint violation is not supported$";
    }

    @Override
    public boolean isNullsLastSorting() {
        return true;
    }

    @Override
    public boolean supportsLobSortingAndFiltering() {
        return false;
    }

    @Override
    public Integer getMaxIdsBatchSize() {
        return 16384;
    }

    @Override
    public String getTypeAndVersion() {
        return "snowflake";
    }
}
