package com.company.snowflake.entity;

import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.Store;

import javax.persistence.*;
import java.util.UUID;

@JmixEntity
@Store(name = "sfds")
@Table(name = "MAIN_ENTITY", indexes = {
        @Index(name = "IDX_MAIN_ENTITY_REFERENCE", columnList = "REFERENCE_ID")
})
@Entity
public class MainEntity {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @InstanceName
    @Column(name = "NAME")
    private String name;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @JoinColumn(name = "REFERENCE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private ReferenceEntity reference;

    public ReferenceEntity getReference() {
        return reference;
    }

    public void setReference(ReferenceEntity reference) {
        this.reference = reference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}