package com.company.snowflake.screen.mainentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.MainEntity;

@UiController("MainEntity.browse")
@UiDescriptor("main-entity-browse.xml")
@LookupComponent("mainEntitiesTable")
public class MainEntityBrowse extends StandardLookup<MainEntity> {
}