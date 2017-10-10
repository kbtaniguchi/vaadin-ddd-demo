package com.example.demo.presentation.view.useradmin.dialog.register.presenter;

import com.example.demo.domain.model.user.UserRegister;

public interface IUserRegisterPresenter {

    void attachView(IUserRegisterDialog view);

    void onClickSaveButton(UserRegister userRegister);

    void onClickCancelButton();
}
