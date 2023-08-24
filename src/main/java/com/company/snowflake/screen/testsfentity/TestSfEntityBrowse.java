package com.company.snowflake.screen.testsfentity;

import io.jmix.ui.screen.*;
import com.company.snowflake.entity.TestSfEntity;

@UiController("TestSfEntity.browse")
@UiDescriptor("test-sf-entity-browse.xml")
@LookupComponent("testSfEntitiesTable")
public class TestSfEntityBrowse extends StandardLookup<TestSfEntity> {
}