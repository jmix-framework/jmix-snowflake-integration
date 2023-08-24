package com.company.snowflake.screen.timetypesmainentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.TimeTypesMainEntity;

@UiController("TimeTypesMainEntity.browse")
@UiDescriptor("time-types-main-entity-browse.xml")
@LookupComponent("timeTypesMainEntitiesTable")
public class TimeTypesMainEntityBrowse extends StandardLookup<TimeTypesMainEntity> {
}