package com.example.demo.presentation.ui.application;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.annotation.SpringViewDisplay;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.ValoTheme;

@Theme("valo")
@Title("demo application")
@SpringUI
@SpringViewDisplay
public class ApplicationUI extends UI implements ViewDisplay {
    final ApplicationUIContent content = new ApplicationUIContent();

    @Override
    protected void init(VaadinRequest request) {
        setContent(content);
        setSizeFull();
        addStyleName(ValoTheme.UI_WITH_MENU);
    }

    @Override
    public void showView(View view) {
        content.sideMenu.selectedItemRelatedTo(view);
        content.viewDisplay.setContent(view.getViewComponent());
    }
}