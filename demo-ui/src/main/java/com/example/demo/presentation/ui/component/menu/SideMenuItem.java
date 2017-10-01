package com.example.demo.presentation.ui.component.menu;

import com.vaadin.ui.Button;
import com.vaadin.ui.themes.ValoTheme;

class SideMenuItem extends Button {


    SideMenuItem(String caption) {
        setCaption(caption);
        setPrimaryStyleName(ValoTheme.MENU_ITEM);
    }
}
