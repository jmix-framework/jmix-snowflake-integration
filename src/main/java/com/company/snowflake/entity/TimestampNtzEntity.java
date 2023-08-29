package com.company.snowflake.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.Store;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.UUID;

@JmixEntity
@Store(name = "sfds")
@Table(name = "TIMESTAMP_NTZ_ENTITY")
@Entity
public class TimestampNtzEntity {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @InstanceName
    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "DATE_TIME_VALUE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTimeValue;

    @Column(name = "LOCAL_DATE_TIME_VALUE")
    private LocalDateTime localDateTimeValue;

    @Column(name = "OFFSET_DATE_TIME_VALUE")
    private OffsetDateTime offsetDateTimeValue;

    public OffsetDateTime getOffsetDateTimeValue() {
        return offsetDateTimeValue;
    }

    public void setOffsetDateTimeValue(OffsetDateTime offsetDateTimeValue) {
        this.offsetDateTimeValue = offsetDateTimeValue;
    }

    public LocalDateTime getLocalDateTimeValue() {
        return localDateTimeValue;
    }

    public void setLocalDateTimeValue(LocalDateTime localDateTimeValue) {
        this.localDateTimeValue = localDateTimeValue;
    }

    public Date getDateTimeValue() {
        return dateTimeValue;
    }

    public void setDateTimeValue(Date dateTimeValue) {
        this.dateTimeValue = dateTimeValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}