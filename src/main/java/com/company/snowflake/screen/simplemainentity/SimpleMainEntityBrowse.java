package com.company.snowflake.screen.simplemainentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.SimpleMainEntity;

@UiController("SimpleMainEntity.browse")
@UiDescriptor("simple-main-entity-browse.xml")
@LookupComponent("simpleMainEntitiesTable")
public class SimpleMainEntityBrowse extends StandardLookup<SimpleMainEntity> {
}