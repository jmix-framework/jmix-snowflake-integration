package com.company.snowflake.screen.sandbox;

import com.company.snowflake.entity.DateTimeTypesEntity;
import io.jmix.core.DataManager;
import io.jmix.data.Sequence;
import io.jmix.data.Sequences;
import io.jmix.ui.Notifications;
import io.jmix.ui.component.Button;
import io.jmix.ui.component.TextArea;
import io.jmix.ui.component.TextField;
import io.jmix.ui.screen.Screen;
import io.jmix.ui.screen.Subscribe;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;

@UiController("SandboxScreen")
@UiDescriptor("sandbox-screen.xml")
public class SandboxScreen extends Screen {

    private static final Logger log = LoggerFactory.getLogger(SandboxScreen.class);
    @Autowired
    private Notifications notifications;
    @Autowired
    private Sequences sequences;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private TextField<String> sequenceNameField;
    @Autowired
    private TextArea<String> outputField;

    @Subscribe("getNextValBtn")
    public void onGetNextValBtnClick(final Button.ClickEvent event) {
        String sequenceName = sequenceNameField.getValue();
        if (sequenceName == null) {
            return;
        }

        Sequence sequence = Sequence.withName(sequenceName).setStore("sfds");
        long nextValue = sequences.createNextValue(sequence);
        String currentOutputValue = outputField.getValue();
        outputField.setValue(currentOutputValue + System.lineSeparator() + buildOutputLine("Next value = " + nextValue));
    }

    @Subscribe("getCurValBtn")
    public void onGetCurValBtnClick(final Button.ClickEvent event) {
        String sequenceName = sequenceNameField.getValue();
        if (sequenceName == null) {
            return;
        }

        Sequence sequence = Sequence.withName(sequenceName).setStore("sfds");
        long currentValue = sequences.getCurrentValue(sequence);
        String currentOutputValue = outputField.getValue();
        outputField.setValue(currentOutputValue + System.lineSeparator() + buildOutputLine("Current value = " + currentValue));
    }

    @Subscribe("resetSeqBtn")
    public void onResetSeqBtnClick(final Button.ClickEvent event) {
        String sequenceName = sequenceNameField.getValue();
        if (sequenceName == null) {
            return;
        }

        Sequence sequence = Sequence.withName(sequenceName).setStore("sfds");
        sequences.setCurrentValue(sequence, 1L);
        String currentOutputValue = outputField.getValue();
        outputField.setValue(currentOutputValue + System.lineSeparator() + buildOutputLine("Sequence '" + sequenceName + "' has been reset"));
    }

    @Subscribe("dropSeqBtn")
    public void onDropSeqBtnClick(final Button.ClickEvent event) {
        String sequenceName = sequenceNameField.getValue();
        if (sequenceName == null) {
            return;
        }

        Sequence sequence = Sequence.withName(sequenceName).setStore("sfds");
        sequences.deleteSequence(sequence);
        String currentOutputValue = outputField.getValue();
        outputField.setValue(currentOutputValue + System.lineSeparator() + buildOutputLine("Sequence '" + sequenceName + "' has been deleted"));
    }

    @Subscribe("loadAllDateTimeEntitiesBtn")
    public void onLoadAllDateTimeEntitiesBtnClick(final Button.ClickEvent event) {
        List<DateTimeTypesEntity> loaded = dataManager.load(DateTimeTypesEntity.class).all().list();
        int i = 0;
    }



    private String buildOutputLine(String text) {
        return LocalDateTime.now() + ": " + text;
    }
}