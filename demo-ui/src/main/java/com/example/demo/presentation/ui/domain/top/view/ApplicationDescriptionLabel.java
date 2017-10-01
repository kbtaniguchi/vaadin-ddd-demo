package com.example.demo.presentation.ui.domain.top.view;

import com.vaadin.ui.Label;

class ApplicationDescriptionLabel extends Label {
    final String text = "this is a demo application.";

    ApplicationDescriptionLabel() {
        setValue(text);
    }
}
