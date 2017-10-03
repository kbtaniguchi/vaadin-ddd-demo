package com.example.demo.presentation.view.useradmin.presenter.dialog.register;

import com.example.demo.domain.model.user.User;

public interface IUserRegisterPresenter {

    void attachView(IUserRegisterDialog view);

    void clickSaveButton(User user);

    void clickCancelButton(User user);
}
