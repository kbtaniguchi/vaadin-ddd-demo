package com.example.demo.presentation.view.fundamentals.fragment.dialog.form;

import com.vaadin.shared.ui.window.WindowMode;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

public abstract class FormDialog extends Window {
    FormDisplay formDisplay = new FormDisplay();
    ErrorDisplay errorDisplay = new ErrorDisplay();
    SaveCancelButtons buttons = new SaveCancelButtons();

    protected FormDialog(String caption) {
        VerticalLayout body = new VerticalLayout();
        body.addComponents(formDisplay, errorDisplay, buttons);

        setContent(body);
        setCaption(caption);
        setModal(true);
        setResizable(false);
        setWidth(500, Unit.PIXELS);
        setWindowMode(WindowMode.NORMAL);
    }

    protected void setForm(FormLayout form) {
        formDisplay.setFrom(form);
    }

    protected void addClickEvenListenerToSaveButton(ClickListener clickListener) {
        buttons.saveButton.addClickListener(clickListener);
    }

    protected void addClickEventListenerToCancelButton(ClickListener clickListener) {
        buttons.cancelButton.addClickListener(clickListener);
    }

    protected void setErrorMessageAsHtml(String messageAsHtml) {
        errorDisplay.setMessageAsHtml(messageAsHtml);
    }

    protected void setVisibleOfErrorDisplay(boolean visible) {
        errorDisplay.setVisible(visible);
    }
}
