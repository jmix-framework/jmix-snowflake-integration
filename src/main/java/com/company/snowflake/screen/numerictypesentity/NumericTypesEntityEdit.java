package com.company.snowflake.screen.numerictypesentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.NumericTypesEntity;

@UiController("NumericTypesEntity.edit")
@UiDescriptor("numeric-types-entity-edit.xml")
@EditedEntityContainer("numericTypesEntityDc")
public class NumericTypesEntityEdit extends StandardEditor<NumericTypesEntity> {
}