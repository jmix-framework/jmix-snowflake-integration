package com.company.snowflake.screen.datetimetypesentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.DateTimeTypesEntity;

@UiController("DateTimeTypesEntity.browse")
@UiDescriptor("date-time-types-entity-browse.xml")
@LookupComponent("dateTimeTypesEntitiesTable")
public class DateTimeTypesEntityBrowse extends StandardLookup<DateTimeTypesEntity> {
}