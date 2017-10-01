package com.example.demo.presentation.ui.component.header;

import com.vaadin.ui.VerticalLayout;

public class Header extends VerticalLayout {
    final ApplicationTitleLabel applicationTitle = new ApplicationTitleLabel();

    public Header() {
        addComponent(applicationTitle);
        setMargin(false);
    }
}
