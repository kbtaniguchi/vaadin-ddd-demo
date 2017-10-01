package com.example.demo.presentation.ui.component.layout;

import com.example.demo.presentation.ui.component.footer.Footer;
import com.example.demo.presentation.ui.component.header.Header;
import com.example.demo.presentation.ui.component.menu.SideMenu;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;

public abstract class BaseViewLayout extends HorizontalLayout {
    final VerticalLayout contentsLayout = new VerticalLayout();

    final SideMenu sideMenu = new SideMenu();
    final Header header = new Header(headerText());
    final Footer footer = new Footer();

    public BaseViewLayout() {
        contentsLayout.addComponents(header, footer);
        contentsLayout.setSizeFull();

        addComponents(sideMenu, contentsLayout);
        setExpandRatio(contentsLayout, 1.0f);
        setSizeFull();
    }

    protected void addBody(Component body) {
        contentsLayout.addComponent(body, 1);
        contentsLayout.setExpandRatio(body, 1.0f);
    }

    abstract protected String headerText();

}
