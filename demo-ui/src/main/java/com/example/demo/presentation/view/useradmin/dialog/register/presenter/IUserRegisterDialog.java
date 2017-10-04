package com.example.demo.presentation.view.useradmin.dialog.register.presenter;

public interface IUserRegisterDialog {

    boolean hasValidationErrors();

    void showValidationErrorMessages();

    void returnUserAdminView();
}
