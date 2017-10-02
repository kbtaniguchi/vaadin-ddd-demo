package com.example.demo.presentation.view.top.presenter;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.ViewScope;

@SpringComponent
@ViewScope
public class TopPresenter implements ITopPresenter {
    ITopView view; // cannot view instance injection

    @Override
    public void setView(ITopView view) {
        this.view = view;
    }
}
