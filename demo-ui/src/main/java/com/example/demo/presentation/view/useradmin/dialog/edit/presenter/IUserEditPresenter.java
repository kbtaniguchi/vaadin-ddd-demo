package com.example.demo.presentation.view.useradmin.dialog.edit.presenter;

import com.example.demo.domain.model.user.UserRegister;

public interface IUserEditPresenter {

    void attachView(IUserEditDialog view);

    void onClickSaveButton(UserRegister userRegister);

    void onClickCancelButton();
}
