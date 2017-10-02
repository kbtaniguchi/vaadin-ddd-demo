package com.example.demo.presentation.ui.application.menu;

import com.vaadin.ui.Label;
import com.vaadin.ui.themes.ValoTheme;

class Title extends Label {
    final String text = "demo application";

    Title() {
        addStyleName(ValoTheme.MENU_TITLE);
        setValue(text);
    }
}
