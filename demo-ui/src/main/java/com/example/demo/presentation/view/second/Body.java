package com.example.demo.presentation.view.second;

import com.example.demo.presentation.view.top.view.TopView;
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
