package com.example.demo.presentation.ui.component.menu;

import com.vaadin.ui.CssLayout;
import com.vaadin.ui.themes.ValoTheme;

public class SideMenu extends CssLayout {
    final SideMenuTitle menuTitle = new SideMenuTitle();
    final SideMenuItem firstMenuItem = new SideMenuItem("firstMenuItem");

    public SideMenu() {
        setPrimaryStyleName(ValoTheme.MENU_ROOT);
        addComponent(menuTitle);
        addComponent(firstMenuItem);
    }
}
