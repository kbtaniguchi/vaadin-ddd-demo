package com.example.demo.presentation.view.useradmin.dialog.register.presenter;

public interface IUserRegisterDialog {

    boolean isValid();

    void showErrorMessage();

    void returnUserAdminView();

    void closeUserRegisterDialog();
}
