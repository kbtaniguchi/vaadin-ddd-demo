package com.example.demo.presentation.ui.application;

import com.example.demo.presentation.ui.application.menu.SideMenu;
import com.example.demo.presentation.ui.application.panel.ViewDisplayPanel;
import com.vaadin.ui.HorizontalLayout;

class ApplicationUIContent extends HorizontalLayout {
    final SideMenu sideMenu = new SideMenu();
    final ViewDisplayPanel viewDisplay = new ViewDisplayPanel();

    ApplicationUIContent() {
        addComponents(sideMenu, viewDisplay);
        setSizeFull();
        setExpandRatio(viewDisplay, 1.0f);
    }
}
