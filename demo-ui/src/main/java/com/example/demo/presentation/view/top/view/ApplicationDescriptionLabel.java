package com.example.demo.presentation.view.top.view;

import com.vaadin.ui.Label;

class ApplicationDescriptionLabel extends Label {
    final String text = "this is a demo application.";

    ApplicationDescriptionLabel() {
        setValue(text);
    }
}
