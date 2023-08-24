package com.company.snowflake.screen.referenceentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.ReferenceEntity;

@UiController("ReferenceEntity.edit")
@UiDescriptor("reference-entity-edit.xml")
@EditedEntityContainer("referenceEntityDc")
public class ReferenceEntityEdit extends StandardEditor<ReferenceEntity> {
}