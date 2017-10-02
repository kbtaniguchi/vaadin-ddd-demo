package com.example.demo.presentation.view.base.layout;

import com.example.demo.presentation.view.base.fragment.footer.Footer;
import com.example.demo.presentation.view.base.fragment.header.Header;
import com.vaadin.ui.Component;
import com.vaadin.ui.VerticalLayout;

public abstract class BaseViewLayout extends VerticalLayout {
    final Footer footer = new Footer();

    public BaseViewLayout() {
        addComponent(footer);
        setSizeFull();
    }

    protected void addHeaderAndBody(Header header, Component body) {
        addComponentAsFirst(header);
        addComponent(body, 1);
        setExpandRatio(body, 1.0f);
    }
}
