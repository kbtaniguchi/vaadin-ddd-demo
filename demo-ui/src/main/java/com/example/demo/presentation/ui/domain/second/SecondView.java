package com.example.demo.presentation.ui.domain.second;

import com.example.demo.presentation.ui.component.layout.BaseViewLayout;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;

import javax.annotation.PostConstruct;

@SpringView(name = SecondView.VIEW_NAME)
public class SecondView extends BaseViewLayout implements View {
    public static final String VIEW_NAME = "SecondView";
    Body body = new Body();

    @PostConstruct
    void init() {
        addBody(body);
    }

    @Override
    public void enter(ViewChangeEvent event) {
        // This view is constructed in the init() method()
    }

    @Override
    protected String headerText() {
        return "Second View";
    }
}
