package com.company.snowflake.screen.timestamptzentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.TimestampTzEntity;

@UiController("TimestampTzEntity.browse")
@UiDescriptor("timestamp-tz-entity-browse.xml")
@LookupComponent("timestampTzEntitiesTable")
public class TimestampTzEntityBrowse extends StandardLookup<TimestampTzEntity> {
}