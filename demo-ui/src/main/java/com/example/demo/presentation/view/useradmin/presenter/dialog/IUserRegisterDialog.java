package com.example.demo.presentation.view.useradmin.presenter.dialog;

public interface IUserRegisterDialog {

    boolean isValid();

    void showErrorMessage();

    void returnUserAdminView();

    void closeUserRegisterDialog();
}
