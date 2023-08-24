package com.company.snowflake.screen.booleantypesentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.BooleanTypesEntity;

@UiController("BooleanTypesEntity.browse")
@UiDescriptor("boolean-types-entity-browse.xml")
@LookupComponent("booleanTypesEntitiesTable")
public class BooleanTypesEntityBrowse extends StandardLookup<BooleanTypesEntity> {
}