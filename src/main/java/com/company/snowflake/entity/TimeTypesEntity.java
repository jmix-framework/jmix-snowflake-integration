package com.company.snowflake.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.Store;

import javax.persistence.*;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.util.Date;
import java.util.UUID;

@JmixEntity
@Store(name = "sfds")
@Table(name = "TIME_TYPES_ENTITY")
@Entity
public class TimeTypesEntity {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "TIME_AS_TIME")
    @Temporal(TemporalType.TIME)
    private Date timeAsTime;

    @Column(name = "TIME_AS_LOCAL_TIME")
    private LocalTime timeAsLocalTime;

    @Column(name = "TIME_AS_OFFSET_TIME")
    private OffsetTime timeAsOffsetTime;

    public OffsetTime getTimeAsOffsetTime() {
        return timeAsOffsetTime;
    }

    public void setTimeAsOffsetTime(OffsetTime timeAsOffsetTime) {
        this.timeAsOffsetTime = timeAsOffsetTime;
    }

    public LocalTime getTimeAsLocalTime() {
        return timeAsLocalTime;
    }

    public void setTimeAsLocalTime(LocalTime timeAsLocalTime) {
        this.timeAsLocalTime = timeAsLocalTime;
    }

    public Date getTimeAsTime() {
        return timeAsTime;
    }

    public void setTimeAsTime(Date timeAsTime) {
        this.timeAsTime = timeAsTime;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}