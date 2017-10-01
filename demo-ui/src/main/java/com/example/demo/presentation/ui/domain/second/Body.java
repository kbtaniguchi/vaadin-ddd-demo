package com.example.demo.presentation.ui.domain.second;

import com.example.demo.presentation.ui.domain.top.view.TopView;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

class Body extends VerticalLayout {
    Body() {
        setSizeFull();
        addComponent(new Label("second view"));
        addComponent(new Button("to top view",
                event -> getUI().getNavigator().navigateTo(TopView.VIEW_NAME)));
    }
}
