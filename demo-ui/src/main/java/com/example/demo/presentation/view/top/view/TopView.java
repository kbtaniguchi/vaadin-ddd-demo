package com.example.demo.presentation.view.top.view;

import com.example.demo.presentation.view.fundamentals.fragment.header.Header;
import com.example.demo.presentation.view.fundamentals.layout.BaseViewLayout;
import com.vaadin.navigator.View;
import com.vaadin.spring.annotation.SpringView;

@SpringView(name = TopView.VIEW_NAME)
public class TopView extends BaseViewLayout implements View {
    public static final String VIEW_NAME = ""; // need top view name is ""
    public static final String CAPTION = "Demo Application Top";

    final Header header = new Header(CAPTION);
    final Body body = new Body();

    public TopView() {
        addHeaderAndBody(header, body);
        setCaption(CAPTION);
    }
}
