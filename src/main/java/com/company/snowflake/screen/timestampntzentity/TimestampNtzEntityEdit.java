package com.company.snowflake.screen.timestampntzentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.TimestampNtzEntity;

@UiController("TimestampNtzEntity.edit")
@UiDescriptor("timestamp-ntz-entity-edit.xml")
@EditedEntityContainer("timestampNtzEntityDc")
public class TimestampNtzEntityEdit extends StandardEditor<TimestampNtzEntity> {
}