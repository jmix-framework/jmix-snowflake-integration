package com.company.snowflake.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.Store;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@JmixEntity
@Store(name = "sfds")
@Table(name = "STRING_TYPES_ENTITY")
@Entity
public class StringTypesEntity {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "VARCHAR_VALUE")
    private String varcharValue;

    @Column(name = "CHAR_VALUE")
    private Character charValue;

    @Column(name = "CHARACTER_VALUE")
    private Character characterValue;

    @Column(name = "TEXT_VALUE")
    private String textValue;

    @Column(name = "STRING_VALUE")
    private String stringValue;

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public String getTextValue() {
        return textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

    public Character getCharacterValue() {
        return characterValue;
    }

    public void setCharacterValue(Character characterValue) {
        this.characterValue = characterValue;
    }

    public Character getCharValue() {
        return charValue;
    }

    public void setCharValue(Character charValue) {
        this.charValue = charValue;
    }

    public String getVarcharValue() {
        return varcharValue;
    }

    public void setVarcharValue(String varcharValue) {
        this.varcharValue = varcharValue;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}