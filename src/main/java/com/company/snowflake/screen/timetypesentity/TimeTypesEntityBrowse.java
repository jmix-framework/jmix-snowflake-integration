package com.company.snowflake.screen.timetypesentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.TimeTypesEntity;

@UiController("TimeTypesEntity.browse")
@UiDescriptor("time-types-entity-browse.xml")
@LookupComponent("timeTypesEntitiesTable")
public class TimeTypesEntityBrowse extends StandardLookup<TimeTypesEntity> {
}