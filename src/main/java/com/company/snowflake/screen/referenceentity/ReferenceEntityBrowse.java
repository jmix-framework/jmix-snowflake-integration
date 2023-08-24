package com.company.snowflake.screen.referenceentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.ReferenceEntity;

@UiController("ReferenceEntity.browse")
@UiDescriptor("reference-entity-browse.xml")
@LookupComponent("referenceEntitiesTable")
public class ReferenceEntityBrowse extends StandardLookup<ReferenceEntity> {
}