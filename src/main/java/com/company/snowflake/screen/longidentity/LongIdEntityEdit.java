package com.company.snowflake.screen.longidentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.LongIdEntity;

@UiController("LongIdEntity.edit")
@UiDescriptor("long-id-entity-edit.xml")
@EditedEntityContainer("longIdEntityDc")
public class LongIdEntityEdit extends StandardEditor<LongIdEntity> {
}