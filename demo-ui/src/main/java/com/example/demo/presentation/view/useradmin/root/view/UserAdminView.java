package com.example.demo.presentation.view.useradmin.root.view;

import com.example.demo.domain.model.user.summary.UserSummaries;
import com.example.demo.domain.model.user.summary.UserSummary;
import com.example.demo.presentation.view.fundamentals.fragment.header.ViewHeader;
import com.example.demo.presentation.view.fundamentals.layout.BaseViewLayout;
import com.example.demo.presentation.view.useradmin.dialog.delete.view.DeleteConfirmDialog;
import com.example.demo.presentation.view.useradmin.dialog.edit.view.UserEditDialog;
import com.example.demo.presentation.view.useradmin.dialog.register.view.UserRegisterDialog;
import com.example.demo.presentation.view.useradmin.root.presenter.IUserAdminPresenter;
import com.example.demo.presentation.view.useradmin.root.presenter.IUserAdminView;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

@SpringView(name = UserAdminView.VIEW_NAME)
public class UserAdminView extends BaseViewLayout implements View, IUserAdminView {
    public static final String VIEW_NAME = "UserAdminView";
    public static final String CAPTION = "User Admin";

    ViewHeader viewHeader = new ViewHeader(CAPTION);
    UserAdminViewBody viewBody = new UserAdminViewBody();

    IUserAdminPresenter presenter;

    @Autowired
    public UserAdminView(IUserAdminPresenter presenter) {
        super();
        this.presenter = presenter;
        setCaption(CAPTION);

        addHeaderAndBody(viewHeader, viewBody);
    }

    @PostConstruct
    void init() {
        presenter.attachView(this);
        presenter.loadUserSummaries();
    }

    @Override
    public void enter(ViewChangeEvent event) {
        viewBody.controlArea.addClickEventListenerToAddButton(e -> presenter.onClickAddButton());
        viewBody.controlArea.addClickEventListenerToEditButton(e -> presenter.onClickEditButton());
        viewBody.controlArea.addClickEventListenerToDeleteButton(e -> presenter.onClickDeleteButton());
        viewBody.userSummaryGrid.addSelectionListener(e -> presenter.onSelectGrid(viewBody.userSummaryGrid.allSelections()));
    }

    @Override
    public void reflectToGridFrom(UserSummaries userSummaries) {
        viewBody.userSummaryGrid.reflectFrom(userSummaries);
    }

    @Override
    public void toStateOfOnlyCanAdd() {
        viewBody.controlArea.toStateOfOnlyCanAdd();
    }

    @Override
    public void toStateOfCanAll() {
        viewBody.controlArea.toStateOfCanAll();
    }

    @Override
    public void toStateOfCanAddAndDelete() {
        viewBody.controlArea.toStateOfCanAddAndDelete();
    }

    @Override
    public UserSummaries allGridSelections() {
        return viewBody.userSummaryGrid.allSelections();
    }

    @Override
    public UserSummary gridSelection() {
        return viewBody.userSummaryGrid.selection();
    }

    @Override
    public void launchUserRegisterDialog() {
        getUI().getNavigator().navigateTo(UserRegisterDialog.VIEW_NAME);
    }

    @Override
    public void launchUserEditDialog() {
        getUI().getNavigator().navigateTo(UserEditDialog.VIEW_NAME);
    }

    @Override
    public void launchDeleteConfirmDialog() {
        getUI().getNavigator().navigateTo(DeleteConfirmDialog.VIEW_NAME);
    }
}
