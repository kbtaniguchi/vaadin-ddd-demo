package com.example.demo.presentation.view.second;

import com.example.demo.presentation.view.base.fragment.header.Header;
import com.example.demo.presentation.view.base.layout.BaseViewLayout;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;

import javax.annotation.PostConstruct;

@SpringView(name = SecondView.VIEW_NAME)
public class SecondView extends BaseViewLayout implements View {
    public static final String VIEW_NAME = "SecondView";
    public static final String CAPTION = "Second View";
    Header header = new Header(CAPTION);
    Body body = new Body();

    @PostConstruct
    void init() {
        addHeaderAndBody(header, body);
        setCaption(CAPTION);
    }

    @Override
    public void enter(ViewChangeEvent event) {
        // This view is constructed in the init() method()
    }
}
