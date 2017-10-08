package com.example.demo.presentation.view.fundamentals.fragment.dialog.form;

import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.Label;
import com.vaadin.ui.themes.ValoTheme;

class ErrorDisplay extends Label {

    ErrorDisplay() {
        addStyleName(ValoTheme.LABEL_FAILURE);
        setVisible(false);
        setSizeFull();
    }

    void setMessageAsHtml(String messageAsHtml) {
        setContentMode(ContentMode.HTML);
        setValue(messageAsHtml);
    }
}
