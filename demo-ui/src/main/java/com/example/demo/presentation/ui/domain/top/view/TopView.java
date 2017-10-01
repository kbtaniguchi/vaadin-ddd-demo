package com.example.demo.presentation.ui.domain.top.view;

import com.example.demo.presentation.ui.component.layout.BaseViewLayout;
import com.example.demo.presentation.ui.domain.second.SecondView;
import com.example.demo.presentation.ui.domain.top.presenter.ITopPresenter;
import com.example.demo.presentation.ui.domain.top.presenter.ITopView;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

@SpringView(name = TopView.VIEW_NAME)
public class TopView extends BaseViewLayout implements View, ITopView {
    public static final String VIEW_NAME = ""; // need top view name is ""
    final Body body = new Body();

    @Autowired
    ITopPresenter presenter;

    @PostConstruct
    void init() {
        presenter.setView(this);
        addBody(body);
        bindListener();
    }

    private void bindListener() {
        body.toSecondViewButton.addClickListener(
                event -> presenter.clickToSecondViewButton());
    }

    @Override
    public void enter(ViewChangeEvent event) {
        // This view is constructed in the init() method()
    }

    @Override
    public void toSecondView() {
        getUI().getNavigator().navigateTo(SecondView.VIEW_NAME);
    }
}
