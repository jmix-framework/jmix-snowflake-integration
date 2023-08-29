package com.company.snowflake.screen.timestampntzentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.TimestampNtzEntity;

@UiController("TimestampNtzEntity.browse")
@UiDescriptor("timestamp-ntz-entity-browse.xml")
@LookupComponent("timestampNtzEntitiesTable")
public class TimestampNtzEntityBrowse extends StandardLookup<TimestampNtzEntity> {
}