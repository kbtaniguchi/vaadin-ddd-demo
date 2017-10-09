package com.example.demo.presentation.view.useradmin.dialog.edit.presenter;

public interface IUserEditDialog {

    boolean hasChangesInForm();

    void showNoChangeErrorMessage();

    boolean hasValidationErrors();

    void showValidationErrorMessages();

    void hideErrorMessages();

    void returnUserAdminView();

}
