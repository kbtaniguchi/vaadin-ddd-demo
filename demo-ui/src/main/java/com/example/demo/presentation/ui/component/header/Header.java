package com.example.demo.presentation.ui.component.header;

import com.vaadin.ui.VerticalLayout;

public class Header extends VerticalLayout {
    final HeaderTitle applicationTitle;

    public Header(String headerText) {
        this.applicationTitle = new HeaderTitle(headerText);
        addComponent(applicationTitle);
        setMargin(false);
    }
}
