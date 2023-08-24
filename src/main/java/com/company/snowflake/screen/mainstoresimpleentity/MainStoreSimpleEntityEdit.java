package com.company.snowflake.screen.mainstoresimpleentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.MainStoreSimpleEntity;

@UiController("MainStoreSimpleEntity.edit")
@UiDescriptor("main-store-simple-entity-edit.xml")
@EditedEntityContainer("mainStoreSimpleEntityDc")
public class MainStoreSimpleEntityEdit extends StandardEditor<MainStoreSimpleEntity> {
}