package com.example.demo.presentation.view.useradmin.root.presenter;

import com.example.demo.application.service.user.UserService;
import com.example.demo.application.service.user.summary.UserSummaryService;
import com.example.demo.domain.model.user.summary.UserSummaries;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.ViewScope;
import org.springframework.beans.factory.annotation.Autowired;

@SpringComponent
@ViewScope
public class UserAdminPresenter implements IUserAdminPresenter {
    IUserAdminView view;

    UserSummaryService userSummaryService;
    UserService userService;

    @Autowired
    public UserAdminPresenter(UserSummaryService userSummaryService,
                              UserService userService) {
        this.userSummaryService = userSummaryService;
        this.userService = userService;
    }

    @Override
    public void attachView(IUserAdminView view) {
        this.view = view;
    }

    @Override
    public void clickAddButton() {
        view.launchUserRegisterDialog();
    }

    @Override
    public void clickDeleteButton() {
        view.launchDeleteConfirmDialog();
    }

    @Override
    public void selectGrid(UserSummaries selections) {
        if (selections.isEmpty()) view.toStateOfOnlyCanAdd();
        if (selections.isSingle()) view.toStateOfCanAll();
        if (selections.isMultiple()) view.toStateOfCanAddAndDelete();
    }
}
