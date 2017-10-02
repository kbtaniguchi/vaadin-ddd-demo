package com.example.demo.presentation.view.base.fragment.header;

import com.vaadin.ui.Label;
import com.vaadin.ui.themes.ValoTheme;

class HeaderTitle extends Label {
    final String text;

    HeaderTitle(String text) {
        this.text = text;
        setValue(text);
        addStyleNames(ValoTheme.LABEL_H1, ValoTheme.LABEL_NO_MARGIN);
    }
}
