package com.company.snowflake.screen.timetypesmainentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.TimeTypesMainEntity;

@UiController("TimeTypesMainEntity.edit")
@UiDescriptor("time-types-main-entity-edit.xml")
@EditedEntityContainer("timeTypesMainEntityDc")
public class TimeTypesMainEntityEdit extends StandardEditor<TimeTypesMainEntity> {
}