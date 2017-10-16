package com.example.demo.presentation.view.top.view;

import com.example.demo.presentation.view.fundamentals.fragment.header.ViewHeader;
import com.example.demo.presentation.view.fundamentals.layout.BaseViewLayout;
import com.vaadin.navigator.View;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.UI;

@SpringView(name = TopView.VIEW_NAME)
public class TopView extends BaseViewLayout implements View {
    public static final String VIEW_NAME = ""; // need top view name is ""
    public static final String CAPTION = "Top";
    public static final String TITLE = "Demo Application: Top";

    final ViewHeader viewHeader = new ViewHeader(CAPTION);
    final TopViewBody viewBody = new TopViewBody();

    public TopView() {
        super();
        addHeaderAndBody(viewHeader, viewBody);
        setCaption(CAPTION);
        UI.getCurrent().getPage().setTitle(TITLE);
    }
}
