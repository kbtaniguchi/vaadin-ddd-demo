package com.example.demo.presentation.view.useradmin.dialog.delete.presenter;

import com.example.demo.domain.model.user.summary.UserSummaries;

public interface IDeleteConfirmPresenter {

    void attachView(IDeleteConfirmDialog view);

    void clickOkButton(UserSummaries userSummaries);

    void clickCancelButton();
}
