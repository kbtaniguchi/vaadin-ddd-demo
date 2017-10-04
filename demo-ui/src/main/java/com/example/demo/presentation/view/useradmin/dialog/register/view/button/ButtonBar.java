package com.example.demo.presentation.view.useradmin.dialog.register.view.button;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button.ClickListener;
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

    public void addClickEvenListenerToSaveButton(ClickListener clickListener) {
        saveButton.addClickListener(clickListener);
    }

    public void addClickEventListenerToCancelButton(ClickListener clickListener) {
        cancelButton.addClickListener(clickListener);
    }
}
