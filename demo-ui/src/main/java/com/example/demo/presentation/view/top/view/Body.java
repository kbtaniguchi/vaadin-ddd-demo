package com.example.demo.presentation.view.top.view;

import com.vaadin.ui.VerticalLayout;

class Body extends VerticalLayout {
    final ApplicationDescription description = new ApplicationDescription();

    Body() {
        setSizeFull();
        addComponents(description);
    }
}
