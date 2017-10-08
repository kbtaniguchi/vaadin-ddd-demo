package com.example.demo.presentation.view.fundamentals.fragment.dialog.confirm;

import com.vaadin.shared.ui.window.WindowMode;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

public abstract class ConfirmDialog extends Window {
    ConfirmMessageDisplay confirmMessageDisplay = new ConfirmMessageDisplay();
    OkCancelButtons buttons = new OkCancelButtons();

    public ConfirmDialog(String message) {
        confirmMessageDisplay.setValue(message);

        VerticalLayout body = new VerticalLayout();
        body.addComponents(confirmMessageDisplay, buttons);

        setContent(body);
        setCaption("Confirm Dialog");
        setModal(true);
        setResizable(false);
        setWidth(300, Unit.PIXELS);
        setWindowMode(WindowMode.NORMAL);
    }

    protected void addClickListenerToOkButton(ClickListener clickListener) {
        buttons.okButton.addClickListener(clickListener);
    }

    protected void addClickListenerToCancelButton(ClickListener clickListener) {
        buttons.cancelButton.addClickListener(clickListener);
    }
}
