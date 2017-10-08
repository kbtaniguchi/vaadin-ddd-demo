package com.example.demo.presentation.view.fundamentals.layout;

import com.example.demo.presentation.view.fundamentals.fragment.footer.ViewFooter;
import com.example.demo.presentation.view.fundamentals.fragment.header.ViewHeader;
import com.vaadin.ui.Component;
import com.vaadin.ui.VerticalLayout;

public abstract class BaseViewLayout extends VerticalLayout {
    final ViewFooter viewFooter = new ViewFooter();

    public BaseViewLayout() {
        addComponent(viewFooter);
        setSizeFull();
    }

    protected void addHeaderAndBody(ViewHeader viewHeader, Component body) {
        addComponentAsFirst(viewHeader);
        addComponent(body, 1);
        setExpandRatio(body, 1.0f);
    }
}
