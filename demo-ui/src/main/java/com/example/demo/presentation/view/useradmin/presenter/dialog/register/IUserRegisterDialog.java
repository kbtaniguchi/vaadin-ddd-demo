package com.example.demo.presentation.view.useradmin.presenter.dialog.register;

public interface IUserRegisterDialog {

    boolean isValid();

    void showErrorMessage();

    void returnUserAdminView();

    void closeUserRegisterDialog();
}
