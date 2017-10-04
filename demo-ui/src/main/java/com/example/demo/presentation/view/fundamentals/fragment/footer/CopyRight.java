package com.example.demo.presentation.view.fundamentals.fragment.footer;

import com.vaadin.ui.Label;
import com.vaadin.ui.themes.ValoTheme;

class CopyRight extends Label {
    final String text = "©bububu10";

    CopyRight() {
        setValue(text);
        addStyleName(ValoTheme.LABEL_TINY);
    }
}
