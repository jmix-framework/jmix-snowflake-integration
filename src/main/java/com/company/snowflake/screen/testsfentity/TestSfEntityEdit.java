package com.company.snowflake.screen.testsfentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.TestSfEntity;

@UiController("TestSfEntity.edit")
@UiDescriptor("test-sf-entity-edit.xml")
@EditedEntityContainer("testSfEntityDc")
public class TestSfEntityEdit extends StandardEditor<TestSfEntity> {
}