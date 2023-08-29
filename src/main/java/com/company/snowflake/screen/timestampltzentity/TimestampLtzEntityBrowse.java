package com.company.snowflake.screen.timestampltzentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.TimestampLtzEntity;

@UiController("TimestampLtzEntity.browse")
@UiDescriptor("timestamp-ltz-entity-browse.xml")
@LookupComponent("timestampLtzEntitiesTable")
public class TimestampLtzEntityBrowse extends StandardLookup<TimestampLtzEntity> {
}