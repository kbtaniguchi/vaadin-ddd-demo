package com.example.demo.presentation.view.useradmin.root.presenter;

import com.example.demo.domain.model.user.summary.UserSummaries;

public interface IUserAdminView {

    void toStateOfOnlyCanAdd();

    void toStateOfCanAll();

    void toStateOfCanAddAndDelete();

    void clearAllGridSelections();

    void launchUserRegisterDialog();

    void launchDeleteConfirmDialog();

    UserSummaries allGridSelections();
}
