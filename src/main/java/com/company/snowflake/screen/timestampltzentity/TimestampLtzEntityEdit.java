package com.company.snowflake.screen.timestampltzentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.TimestampLtzEntity;

@UiController("TimestampLtzEntity.edit")
@UiDescriptor("timestamp-ltz-entity-edit.xml")
@EditedEntityContainer("timestampLtzEntityDc")
public class TimestampLtzEntityEdit extends StandardEditor<TimestampLtzEntity> {
}