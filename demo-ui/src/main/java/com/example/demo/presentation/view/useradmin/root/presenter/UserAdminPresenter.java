package com.example.demo.presentation.view.useradmin.root.presenter;

import com.example.demo.application.service.user.summary.UserSummaryService;
import com.example.demo.domain.model.user.summary.UserSummaries;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.ViewScope;
import org.springframework.beans.factory.annotation.Autowired;

@SpringComponent
@ViewScope
public class UserAdminPresenter implements IUserAdminPresenter {
    IUserAdminView view;

    UserSummaryService userSummaryService;

    @Autowired
    public UserAdminPresenter(UserSummaryService userSummaryService) {
        this.userSummaryService = userSummaryService;
    }

    @Override
    public void attachView(IUserAdminView view) {
        this.view = view;
    }

    @Override
    public void loadUserSummaries() {
        view.reflectToGridFrom(userSummaryService.allUserSummaries());
    }

    @Override
    public void onClickAddButton() {
        view.launchUserRegisterDialog();
    }

    @Override
    public void onClickEditButton() {
        view.launchUserEditDialog();
    }

    @Override
    public void onClickDeleteButton() {
        view.launchDeleteConfirmDialog();
    }

    @Override
    public void onSelectGrid() {
        UserSummaries selections = view.allGridSelections();
        if (selections.isEmpty()) view.toStateOfOnlyCanAdd();
        if (selections.isSingle()) view.toStateOfCanAll();
        if (selections.isMultiple()) view.toStateOfCanAddAndDelete();
        if (selections.hasDeletedSummary()) view.toStateOfOnlyCanAdd();
    }
}
