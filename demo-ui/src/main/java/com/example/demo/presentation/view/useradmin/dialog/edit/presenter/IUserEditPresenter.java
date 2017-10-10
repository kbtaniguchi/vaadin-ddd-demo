package com.example.demo.presentation.view.useradmin.dialog.edit.presenter;

import com.example.demo.domain.model.user.UserEditor;

public interface IUserEditPresenter {

    void attachView(IUserEditDialog view);

    void onClickSaveButton(UserEditor userEditor);

    void onClickCancelButton();
}
