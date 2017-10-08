package com.example.demo.presentation.view.useradmin.root.presenter;

public interface IUserAdminView {

    void activateEditButton();

    void deactivateEditButton();

    void activateDeleteButton();

    void deactivateDeleteButton();

    void clearAllGridSelections();

    void launchUserRegisterDialog();

}
