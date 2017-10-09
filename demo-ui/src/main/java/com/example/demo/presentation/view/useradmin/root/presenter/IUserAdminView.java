package com.example.demo.presentation.view.useradmin.root.presenter;

import com.example.demo.domain.model.user.summary.UserSummaries;
import com.example.demo.domain.model.user.summary.UserSummary;

public interface IUserAdminView {

    void reflectToGridFrom(UserSummaries userSummaries);

    void toStateOfOnlyCanAdd();

    void toStateOfCanAll();

    void toStateOfCanAddAndDelete();

    void launchUserRegisterDialog();

    void launchUserEditDialog();

    void launchDeleteConfirmDialog();

    UserSummaries allGridSelections();

    UserSummary gridSelection();
}
