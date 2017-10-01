package com.example.demo.presentation.ui.domain.top.view;

import com.vaadin.ui.VerticalLayout;

class Body extends VerticalLayout {
    final ApplicationDescriptionLabel descriptionLabel = new ApplicationDescriptionLabel();
    final ToSecondViewButton toSecondViewButton = new ToSecondViewButton();

    Body() {
        setSizeFull();
        addComponents(descriptionLabel, toSecondViewButton);
    }
}
