package com.example.demo.presentation.ui.domain.top.presenter;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.ViewScope;

@SpringComponent
@ViewScope
public class TopPresenter implements ITopPresenter {
    ITopView view;

    @Override
    public void setView(ITopView view) {
        this.view = view;
    }

    @Override
    public void clickToSecondViewButton() {
        view.toSecondView();
    }
}
