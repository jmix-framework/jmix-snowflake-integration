package com.company.snowflake.screen.longidmainstoreentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.LongIdMainStoreEntity;

@UiController("LongIdMainStoreEntity.browse")
@UiDescriptor("long-id-main-store-entity-browse.xml")
@LookupComponent("longIdMainStoreEntitiesTable")
public class LongIdMainStoreEntityBrowse extends StandardLookup<LongIdMainStoreEntity> {
}