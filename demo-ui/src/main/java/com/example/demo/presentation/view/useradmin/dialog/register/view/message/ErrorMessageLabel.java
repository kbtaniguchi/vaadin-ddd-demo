package com.example.demo.presentation.view.useradmin.dialog.register.view.message;

import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.Label;

public class ErrorMessageLabel extends Label {

    public ErrorMessageLabel() {
        addStyleName("failure");
        setVisible(false);
        setSizeFull();
    }

    public void setMessageAsHtml(String messageAsHtml) {
        setContentMode(ContentMode.HTML);
        setValue(messageAsHtml);
    }
}
