package com.example.demo.presentation.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.annotation.SpringViewDisplay;
import com.vaadin.ui.Component;
import com.vaadin.ui.UI;

@Theme("valo")
@Title("demo application")
@SpringUI
@SpringViewDisplay
public class BaseUI extends UI implements ViewDisplay {

    @Override
    protected void init(VaadinRequest request) {
    }

    @Override
    public void showView(View view) {
        setContent((Component) view);
    }
}