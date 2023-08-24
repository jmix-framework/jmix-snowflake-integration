package com.company.snowflake.screen.mainstoresimpleentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.MainStoreSimpleEntity;

@UiController("MainStoreSimpleEntity.browse")
@UiDescriptor("main-store-simple-entity-browse.xml")
@LookupComponent("mainStoreSimpleEntitiesTable")
public class MainStoreSimpleEntityBrowse extends StandardLookup<MainStoreSimpleEntity> {
}