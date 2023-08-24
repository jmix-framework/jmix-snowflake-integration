package com.company.snowflake.screen.booleantypesentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.BooleanTypesEntity;

@UiController("BooleanTypesEntity.edit")
@UiDescriptor("boolean-types-entity-edit.xml")
@EditedEntityContainer("booleanTypesEntityDc")
public class BooleanTypesEntityEdit extends StandardEditor<BooleanTypesEntity> {
}