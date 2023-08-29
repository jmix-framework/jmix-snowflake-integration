package com.company.snowflake.screen.timestamptzentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.TimestampTzEntity;

@UiController("TimestampTzEntity.edit")
@UiDescriptor("timestamp-tz-entity-edit.xml")
@EditedEntityContainer("timestampTzEntityDc")
public class TimestampTzEntityEdit extends StandardEditor<TimestampTzEntity> {
}