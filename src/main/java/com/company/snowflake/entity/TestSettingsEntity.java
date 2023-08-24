package com.company.snowflake.entity;

import io.jmix.appsettings.defaults.AppSettingsDefault;
import io.jmix.appsettings.entity.AppSettingsEntity;
import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import java.math.BigDecimal;

@JmixEntity
@Table(name = "TEST_SETTINGS_ENTITY", indexes = {
        @Index(name = "IDX_TEST_SETTINGS_ENTITY_USER_VALUE", columnList = "USER_VALUE_ID")
})
@Entity
public class TestSettingsEntity extends AppSettingsEntity {

    @Column(name = "TEXT_PARAMETER")
    private String textParameter;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @JoinColumn(name = "USER_VALUE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User userValue;

    @AppSettingsDefault("default value")
    @Column(name = "DEFAULT_TEXT_PARAMETER")
    private String defaultTextParameter;

    @AppSettingsDefault("10")
    @Column(name = "NUMBER_PARAMETER", precision = 19, scale = 2)
    private BigDecimal numberParameter;

    public User getUserValue() {
        return userValue;
    }

    public void setUserValue(User userValue) {
        this.userValue = userValue;
    }


    public String getTextParameter() {
        return textParameter;
    }

    public void setTextParameter(String textParameter) {
        this.textParameter = textParameter;
    }

    public String getDefaultTextParameter() {
        return defaultTextParameter;
    }

    public void setDefaultTextParameter(String defaultTextParameter) {
        this.defaultTextParameter = defaultTextParameter;
    }

    public BigDecimal getNumberParameter() {
        return numberParameter;
    }

    public void setNumberParameter(BigDecimal numberParameter) {
        this.numberParameter = numberParameter;
    }
}