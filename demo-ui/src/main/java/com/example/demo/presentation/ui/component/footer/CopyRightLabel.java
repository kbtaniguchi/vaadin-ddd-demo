package com.example.demo.presentation.ui.component.footer;

import com.vaadin.ui.Label;
import com.vaadin.ui.themes.ValoTheme;

class CopyRightLabel extends Label {
    final String text = "©bububu10";

    CopyRightLabel() {
        setValue(text);
        addStyleName(ValoTheme.LABEL_TINY);
    }
}
