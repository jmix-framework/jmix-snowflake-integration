package com.company.snowflake.screen.numerictypesentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.NumericTypesEntity;

@UiController("NumericTypesEntity.browse")
@UiDescriptor("numeric-types-entity-browse.xml")
@LookupComponent("numericTypesEntitiesTable")
public class NumericTypesEntityBrowse extends StandardLookup<NumericTypesEntity> {
}