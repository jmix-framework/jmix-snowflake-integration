package com.company.snowflake.screen.simplemainentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.SimpleMainEntity;

@UiController("SimpleMainEntity.edit")
@UiDescriptor("simple-main-entity-edit.xml")
@EditedEntityContainer("simpleMainEntityDc")
public class SimpleMainEntityEdit extends StandardEditor<SimpleMainEntity> {
}