package com.company.demo.dbms.firebird;

import io.jmix.data.persistence.DbmsFeatures;
import org.springframework.stereotype.Component;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/**
 * DbmsFeatures implementation for Firebird.
 */
@Component
public class FirebirdDbmsFeatures implements DbmsFeatures {

    @Override
    public Map<String, String> getJpaParameters() {
        HashMap<String, String> params = new HashMap<>();
        params.put("eclipselink.target-database", "org.eclipse.persistence.platform.database.FirebirdPlatform");
        return params;
    }

    @Override
    public String getTimeStampType() {
        return "timestamp";
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
        return "in unique index \"(.+)\"";
    }

    @Override
    public boolean isNullsLastSorting() {
        return false;
    }

    @Override
    public boolean supportsLobSortingAndFiltering() {
        return false;
    }

    @Override
    public String getTypeAndVersion() {
        return "firebird";
    }
}