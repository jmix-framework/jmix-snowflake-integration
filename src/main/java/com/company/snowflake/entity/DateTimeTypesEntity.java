package com.company.snowflake.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.Store;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.UUID;

@JmixEntity
@Store(name = "sfds")
@Table(name = "DATE_TIME_TYPES_ENTITY")
@Entity
public class DateTimeTypesEntity {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "DATE_VALUE")
    private LocalDate dateValue;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_TIME_VALUE")
    private Date dateTimeValue;

    @Temporal(TemporalType.TIME)
    @Column(name = "TIME_VALUE")
    private Date timeValue;

    @Column(name = "TIMESTAMP_VALUE")
    private LocalDateTime timestampValue;

    @Column(name = "TIMESTAMP_NTZ_VALUE")
    private LocalDateTime timestampNtzValue;

    @Column(name = "TIMESTAMP_LTZ_VALUE")
    private OffsetDateTime timestampLtzValue;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TIMESTAMP_TZ_VALUE")
    private Date timestampTzValue;

    public void setTimeValue(Date timeValue) {
        this.timeValue = timeValue;
    }

    public Date getTimeValue() {
        return timeValue;
    }

    public void setTimestampNtzValue(LocalDateTime timestampNtzValue) {
        this.timestampNtzValue = timestampNtzValue;
    }

    public LocalDateTime getTimestampNtzValue() {
        return timestampNtzValue;
    }

    public void setTimestampTzValue(Date timestampTzValue) {
        this.timestampTzValue = timestampTzValue;
    }

    public Date getTimestampTzValue() {
        return timestampTzValue;
    }

    public void setDateTimeValue(Date dateTimeValue) {
        this.dateTimeValue = dateTimeValue;
    }

    public Date getDateTimeValue() {
        return dateTimeValue;
    }

    public OffsetDateTime getTimestampLtzValue() {
        return timestampLtzValue;
    }

    public void setTimestampLtzValue(OffsetDateTime timestampLtzValue) {
        this.timestampLtzValue = timestampLtzValue;
    }

    public LocalDateTime getTimestampValue() {
        return timestampValue;
    }

    public void setTimestampValue(LocalDateTime timestampValue) {
        this.timestampValue = timestampValue;
    }

    public void setDateValue(LocalDate dateValue) {
        this.dateValue = dateValue;
    }

    public LocalDate getDateValue() {
        return dateValue;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}