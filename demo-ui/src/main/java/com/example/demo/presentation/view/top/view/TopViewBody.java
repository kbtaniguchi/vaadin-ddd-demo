package com.example.demo.presentation.view.top.view;

import com.vaadin.ui.VerticalLayout;

class TopViewBody extends VerticalLayout {
    final ApplicationDescription description = new ApplicationDescription();

    TopViewBody() {
        setSizeFull();
        addComponents(description);
    }
}
