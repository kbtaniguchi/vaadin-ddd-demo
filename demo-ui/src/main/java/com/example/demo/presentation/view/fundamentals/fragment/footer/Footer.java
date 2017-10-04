package com.example.demo.presentation.view.fundamentals.fragment.footer;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.VerticalLayout;

public class Footer extends VerticalLayout {
    final CopyRight copyRight = new CopyRight();

    public Footer() {
        addComponent(copyRight);
        setMargin(false);
        setComponentAlignment(copyRight, Alignment.MIDDLE_CENTER);
    }
}
