package com.company.snowflake.screen.stringtypesentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.StringTypesEntity;

@UiController("StringTypesEntity.edit")
@UiDescriptor("string-types-entity-edit.xml")
@EditedEntityContainer("stringTypesEntityDc")
public class StringTypesEntityEdit extends StandardEditor<StringTypesEntity> {
}