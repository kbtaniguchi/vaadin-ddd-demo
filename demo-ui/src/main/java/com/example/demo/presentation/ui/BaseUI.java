package com.example.demo.presentation.ui;

import com.example.demo.presentation.ui.component.menu.SideMenu;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.annotation.SpringViewDisplay;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.ValoTheme;

@Theme("valo")
@Title("demo application")
@SpringUI
@SpringViewDisplay
public class BaseUI extends UI implements ViewDisplay {
    final SideMenu sideMenu = new SideMenu();
    final Panel viewDisplay = new Panel();

    @Override
    protected void init(VaadinRequest request) {
        HorizontalLayout layout = new HorizontalLayout(sideMenu, viewDisplay);
        viewDisplay.setSizeFull();
        viewDisplay.addStyleName(ValoTheme.PANEL_BORDERLESS);
        layout.setSizeFull();
        layout.setExpandRatio(viewDisplay, 1.0f);

        setContent(layout);
        setSizeFull();
        addStyleName(ValoTheme.UI_WITH_MENU);
    }

    @Override
    public void showView(View view) {
        viewDisplay.setContent((Component) view);
    }
}