package com.example.demo.presentation.ui.component.layout;

import com.example.demo.presentation.ui.component.footer.Footer;
import com.example.demo.presentation.ui.component.header.Header;
import com.vaadin.ui.Component;
import com.vaadin.ui.VerticalLayout;

public abstract class BaseViewLayout extends VerticalLayout {
    final Header header = new Header();
    final Footer footer = new Footer();

    public BaseViewLayout() {
        setSizeFull();
        addComponents(header, footer);
    }

    protected void addBody(Component body) {
        addComponent(body, 1);
        setExpandRatio(body, 1.0f);
    }
}
