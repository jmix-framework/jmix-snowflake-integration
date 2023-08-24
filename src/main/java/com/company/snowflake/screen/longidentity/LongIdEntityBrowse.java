package com.company.snowflake.screen.longidentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.LongIdEntity;

@UiController("LongIdEntity.browse")
@UiDescriptor("long-id-entity-browse.xml")
@LookupComponent("longIdEntitiesTable")
public class LongIdEntityBrowse extends StandardLookup<LongIdEntity> {
}