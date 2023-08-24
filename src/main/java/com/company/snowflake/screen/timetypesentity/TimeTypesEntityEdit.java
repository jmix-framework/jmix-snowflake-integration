package com.company.snowflake.screen.timetypesentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.TimeTypesEntity;

@UiController("TimeTypesEntity.edit")
@UiDescriptor("time-types-entity-edit.xml")
@EditedEntityContainer("timeTypesEntityDc")
public class TimeTypesEntityEdit extends StandardEditor<TimeTypesEntity> {
}