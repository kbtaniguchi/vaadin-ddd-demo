package com.example.demo.presentation.view.useradmin.dialog.edit.presenter;

import com.example.demo.domain.model.user.User;

public interface IUserEditPresenter {

    void attachView(IUserEditDialog view);

    void onClickSaveButton(User user);

    void onClickCancelButton();
}
