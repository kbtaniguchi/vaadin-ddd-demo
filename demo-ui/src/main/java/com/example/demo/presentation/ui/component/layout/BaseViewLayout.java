package com.example.demo.presentation.ui.component.layout;

import com.example.demo.presentation.ui.component.footer.Footer;
import com.example.demo.presentation.ui.component.header.Header;
import com.vaadin.ui.Component;
import com.vaadin.ui.VerticalLayout;

public abstract class BaseViewLayout extends VerticalLayout {
    final Header header = new Header(headerText());
    final Footer footer = new Footer();

    public BaseViewLayout() {
        addComponents(header, footer);
        setSizeFull();
    }

    abstract protected String headerText();

    protected void addBody(Component body) {
        addComponent(body, 1);
        setExpandRatio(body, 1.0f);
    }
}
