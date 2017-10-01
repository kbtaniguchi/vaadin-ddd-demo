package com.example.demo.presentation.ui.component.header;

import com.vaadin.ui.Label;
import com.vaadin.ui.themes.ValoTheme;

class ApplicationTitleLabel extends Label {
    final String text = "demo application";

    ApplicationTitleLabel() {
        setValue(text);
        addStyleNames(ValoTheme.LABEL_H1, ValoTheme.LABEL_NO_MARGIN);
    }
}
