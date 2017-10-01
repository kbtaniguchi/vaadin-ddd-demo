package com.example.demo.presentation.ui.component.menu;

import com.vaadin.ui.Label;
import com.vaadin.ui.themes.ValoTheme;

public class SideMenuTitle extends Label {
    final String text = "demo application";

    public SideMenuTitle() {
        addStyleName(ValoTheme.MENU_TITLE);
        setValue(text);
    }
}
