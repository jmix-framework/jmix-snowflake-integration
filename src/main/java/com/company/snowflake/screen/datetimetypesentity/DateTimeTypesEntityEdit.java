package com.company.snowflake.screen.datetimetypesentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.DateTimeTypesEntity;

@UiController("DateTimeTypesEntity.edit")
@UiDescriptor("date-time-types-entity-edit.xml")
@EditedEntityContainer("dateTimeTypesEntityDc")
public class DateTimeTypesEntityEdit extends StandardEditor<DateTimeTypesEntity> {
}