package com.company.snowflake;

import com.zaxxer.hikari.HikariDataSource;
import io.jmix.core.JmixModules;
import io.jmix.core.Resources;
import io.jmix.data.impl.JmixEntityManagerFactoryBean;
import io.jmix.data.impl.JmixTransactionManager;
import io.jmix.data.persistence.DbmsSpecifics;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
public class SnowflakeStoreConfiguration {

    @Bean
    @ConfigurationProperties("sfds.datasource")
    DataSourceProperties sfdsDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @ConfigurationProperties(prefix = "sfds.datasource.hikari")
    DataSource sfdsDataSource(@Qualifier("sfdsDataSourceProperties") DataSourceProperties properties) {
        DataSource dataSource = properties.initializeDataSourceBuilder().build();
        ((HikariDataSource) dataSource).setConnectionTestQuery("select 1");
        return dataSource;
    }

    @Bean
    LocalContainerEntityManagerFactoryBean sfdsEntityManagerFactory(
            @Qualifier("sfdsDataSource") DataSource dataSource,
            JpaVendorAdapter jpaVendorAdapter,
            DbmsSpecifics dbmsSpecifics,
            JmixModules jmixModules,
            Resources resources
    ) {
        return new JmixEntityManagerFactoryBean("sfds", dataSource, jpaVendorAdapter, dbmsSpecifics, jmixModules, resources);
    }

    @Bean
    JpaTransactionManager sfdsTransactionManager(@Qualifier("sfdsEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        return new JmixTransactionManager("sfds", entityManagerFactory);
    }
}
