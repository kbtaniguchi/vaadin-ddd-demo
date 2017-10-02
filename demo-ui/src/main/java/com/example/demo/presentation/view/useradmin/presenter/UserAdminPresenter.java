package com.example.demo.presentation.view.useradmin.presenter;

import com.example.demo.application.service.user.summary.UserSummaryService;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.ViewScope;
import org.springframework.beans.factory.annotation.Autowired;

@SpringComponent
@ViewScope
public class UserAdminPresenter implements IUserAdminPresenter {
    IUserAdminView view;

    @Autowired
    UserSummaryService userSummaryService;

    @Override
    public void attachView(IUserAdminView view) {
        this.view = view;
    }

    @Override
    public void clickRegisterButton() {
        view.launchUserRegisterDialog();
    }
}
