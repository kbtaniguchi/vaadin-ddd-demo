package com.example.demo.presentation.view.useradmin.view.dialog.register.button;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;

public class ButtonBar extends HorizontalLayout {
    final SaveButton saveButton = new SaveButton();
    final CancelButton cancelButton = new CancelButton();

    public ButtonBar() {
        HorizontalLayout buttons = new HorizontalLayout(saveButton, cancelButton);
        buttons.setMargin(false);
        addComponent(buttons);
        setComponentAlignment(buttons, Alignment.MIDDLE_CENTER);
        setSizeFull();
    }
}
