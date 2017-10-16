package com.example.demo.presentation.view.fundamentals.dialog.form;

import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.Label;
import com.vaadin.ui.themes.ValoTheme;

class ErrorDisplay extends Label {
    static final String ID = "ErrorDisplay";

    ErrorDisplay() {
        setId(ID);
        addStyleName(ValoTheme.LABEL_FAILURE);
        setVisible(false);
        setSizeFull();
    }

    void setMessageAsHtml(String messageAsHtml) {
        setContentMode(ContentMode.HTML);
        setValue(messageAsHtml);
    }
}
