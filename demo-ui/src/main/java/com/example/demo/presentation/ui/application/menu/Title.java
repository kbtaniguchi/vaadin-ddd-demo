package com.example.demo.presentation.ui.application.menu;

import com.vaadin.ui.Label;
import com.vaadin.ui.themes.ValoTheme;

class Title extends Label {

    Title() {
        setValue("demo application");
        addStyleName(ValoTheme.MENU_TITLE);
    }
}
