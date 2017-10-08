package com.example.demo.presentation.view.fundamentals.fragment.dialog.form;

import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.Label;

class ErrorDisplay extends Label {

    ErrorDisplay() {
        addStyleName("failure");
        setVisible(false);
        setSizeFull();
    }

    void setMessageAsHtml(String messageAsHtml) {
        setContentMode(ContentMode.HTML);
        setValue(messageAsHtml);
    }
}
