package com.example.demo.presentation.view.fundamentals.dialog.form;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;

class SaveCancelButtons extends HorizontalLayout {
    final SaveButton saveButton = new SaveButton();
    final CancelButton cancelButton = new CancelButton();

    SaveCancelButtons() {
        HorizontalLayout buttons = new HorizontalLayout(saveButton, cancelButton);
        buttons.setMargin(false);
        addComponent(buttons);
        setComponentAlignment(buttons, Alignment.MIDDLE_CENTER);
        setSizeFull();
    }
}
