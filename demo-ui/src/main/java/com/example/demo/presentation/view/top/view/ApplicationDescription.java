package com.example.demo.presentation.view.top.view;

import com.vaadin.ui.Label;

class ApplicationDescription extends Label {
    final String text = "this is a demo application.";

    ApplicationDescription() {
        setValue(text);
    }
}
