package com.example.demo.presentation.view.fundamentals.fragment.header;

import com.vaadin.ui.VerticalLayout;

public class ViewHeader extends VerticalLayout {
    final HeaderTitle applicationTitle;

    public ViewHeader(String viewCaption) {
        this.applicationTitle = new HeaderTitle(viewCaption);
        addComponent(applicationTitle);
        setMargin(false);
    }
}
