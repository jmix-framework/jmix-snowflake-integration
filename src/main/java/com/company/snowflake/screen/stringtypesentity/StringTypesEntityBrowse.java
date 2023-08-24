package com.company.snowflake.screen.stringtypesentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.StringTypesEntity;

@UiController("StringTypesEntity.browse")
@UiDescriptor("string-types-entity-browse.xml")
@LookupComponent("stringTypesEntitiesTable")
public class StringTypesEntityBrowse extends StandardLookup<StringTypesEntity> {
}