package com.company.snowflake.screen.mainentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.MainEntity;

@UiController("MainEntity.edit")
@UiDescriptor("main-entity-edit.xml")
@EditedEntityContainer("mainEntityDc")
public class MainEntityEdit extends StandardEditor<MainEntity> {
}