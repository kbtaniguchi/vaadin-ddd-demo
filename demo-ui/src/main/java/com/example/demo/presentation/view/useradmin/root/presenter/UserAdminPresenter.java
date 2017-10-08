package com.example.demo.presentation.view.useradmin.root.presenter;

import com.example.demo.application.service.user.summary.UserSummaryService;
import com.example.demo.domain.model.user.summary.UserSummaries;
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
    public void clickAddButton() {
        view.clearAllGridSelections();
        view.launchUserRegisterDialog();
    }

    @Override
    public void selectGrid(UserSummaries selections) {
        if (selections.isEmpty()) {
            view.deactivateEditButton();
            view.deactivateDeleteButton();
            return;
        }
        if (selections.isSingle()) {
            view.activateEditButton();
            return;
        }
        if (selections.isMultiple()) {
            view.deactivateEditButton();
            view.activateDeleteButton();
            return;
        }
    }
}