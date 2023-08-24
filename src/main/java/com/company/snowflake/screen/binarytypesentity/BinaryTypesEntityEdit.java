package com.company.snowflake.screen.binarytypesentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.BinaryTypesEntity;

@UiController("BinaryTypesEntity.edit")
@UiDescriptor("binary-types-entity-edit.xml")
@EditedEntityContainer("binaryTypesEntityDc")
public class BinaryTypesEntityEdit extends StandardEditor<BinaryTypesEntity> {
}