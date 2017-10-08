package com.example.demo.presentation.view.useradmin.root.presenter;

public interface IUserAdminView {

    void toStateOfOnlyCanAdd();

    void toStateOfCanAll();

    void toStateOfCanAddAndDelete();

    void clearAllGridSelections();

    void launchUserRegisterDialog();

}
