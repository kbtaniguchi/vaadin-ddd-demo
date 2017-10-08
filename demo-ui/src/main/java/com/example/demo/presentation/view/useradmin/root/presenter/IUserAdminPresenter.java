package com.example.demo.presentation.view.useradmin.root.presenter;

import com.example.demo.domain.model.user.summary.UserSummaries;

public interface IUserAdminPresenter {

    void attachView(IUserAdminView view);

    void clickAddButton();

    void selectGrid(UserSummaries selections);
}
