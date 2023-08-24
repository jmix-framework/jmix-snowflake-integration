package com.company.snowflake.screen.binarytypesentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.BinaryTypesEntity;

@UiController("BinaryTypesEntity.browse")
@UiDescriptor("binary-types-entity-browse.xml")
@LookupComponent("binaryTypesEntitiesTable")
public class BinaryTypesEntityBrowse extends StandardLookup<BinaryTypesEntity> {
}