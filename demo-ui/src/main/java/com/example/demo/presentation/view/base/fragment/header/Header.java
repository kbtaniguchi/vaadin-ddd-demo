package com.example.demo.presentation.view.base.fragment.header;

import com.vaadin.ui.VerticalLayout;

public class Header extends VerticalLayout {
    final HeaderTitle applicationTitle;

    public Header(String viewCaption) {
        this.applicationTitle = new HeaderTitle(viewCaption);
        addComponent(applicationTitle);
        setMargin(false);
    }
}
