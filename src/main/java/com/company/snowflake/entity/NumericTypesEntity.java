package com.company.snowflake.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.Store;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;

@JmixEntity
@Store(name = "sfds")
@Table(name = "NUMERIC_TYPES_ENTITY")
@Entity
public class NumericTypesEntity {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "NUMBER_VALUE", precision = 19, scale = 2)
    private BigDecimal numberValue;

    @Column(name = "NUMERIC_VALUE", precision = 19, scale = 2)
    private BigDecimal numericValue;

    @Column(name = "DECIMAL_VALUE", precision = 19, scale = 2)
    private BigDecimal decimalValue;

    @Column(name = "INT_VALUE")
    private Integer intValue;

    @Column(name = "INTEGER_VALUE")
    private Integer integerValue;

    @Column(name = "BIGINT_VALUE", precision = 19)
    private BigInteger bigintValue;

    @Column(name = "SMALLINT_VALUE")
    private Short smallintValue;

    @Column(name = "TINYINT_VALUE")
    private Short tinyintValue;

    @Column(name = "BYTEINT_VALUE")
    private Short byteintValue;

    @Column(name = "FLOAT_VALUE")
    private Float floatValue;

    @Column(name = "FLOAT4_VALUE")
    private Float float4Value;

    @Column(name = "FLOAT8_VALUE")
    private Float float8Value;

    @Column(name = "DOUBLE_VALUE")
    private Double doubleValue;

    @Column(name = "DOUBLE_PRECISION_VALUE")
    private Double doublePrecisionValue;

    @Column(name = "REAL_VALUE")
    private Double realValue;

    public Double getRealValue() {
        return realValue;
    }

    public void setRealValue(Double realValue) {
        this.realValue = realValue;
    }

    public Double getDoublePrecisionValue() {
        return doublePrecisionValue;
    }

    public void setDoublePrecisionValue(Double doublePrecisionValue) {
        this.doublePrecisionValue = doublePrecisionValue;
    }

    public Double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public Float getFloat8Value() {
        return float8Value;
    }

    public void setFloat8Value(Float float8Value) {
        this.float8Value = float8Value;
    }

    public Float getFloat4Value() {
        return float4Value;
    }

    public void setFloat4Value(Float float4Value) {
        this.float4Value = float4Value;
    }

    public Float getFloatValue() {
        return floatValue;
    }

    public void setFloatValue(Float floatValue) {
        this.floatValue = floatValue;
    }

    public Short getByteintValue() {
        return byteintValue;
    }

    public void setByteintValue(Short byteintValue) {
        this.byteintValue = byteintValue;
    }

    public Short getTinyintValue() {
        return tinyintValue;
    }

    public void setTinyintValue(Short tinyintValue) {
        this.tinyintValue = tinyintValue;
    }

    public Short getSmallintValue() {
        return smallintValue;
    }

    public void setSmallintValue(Short smallintValue) {
        this.smallintValue = smallintValue;
    }

    public BigInteger getBigintValue() {
        return bigintValue;
    }

    public void setBigintValue(BigInteger bigintValue) {
        this.bigintValue = bigintValue;
    }

    public Integer getIntegerValue() {
        return integerValue;
    }

    public void setIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
    }

    public Integer getIntValue() {
        return intValue;
    }

    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }

    public BigDecimal getDecimalValue() {
        return decimalValue;
    }

    public void setDecimalValue(BigDecimal decimalValue) {
        this.decimalValue = decimalValue;
    }

    public BigDecimal getNumericValue() {
        return numericValue;
    }

    public void setNumericValue(BigDecimal numericValue) {
        this.numericValue = numericValue;
    }

    public BigDecimal getNumberValue() {
        return numberValue;
    }

    public void setNumberValue(BigDecimal numberValue) {
        this.numberValue = numberValue;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}