package com.example.demo.presentation.ui.application.menu;

import com.vaadin.ui.Label;
import com.vaadin.ui.themes.ValoTheme;

public class Title extends Label {
    final String text = "demo application";

    public Title() {
        addStyleName(ValoTheme.MENU_TITLE);
        setValue(text);
    }
}
