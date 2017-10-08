package com.example.demo.presentation.view.useradmin.root.view;

import com.example.demo.domain.model.user.summary.UserSummaries;
import com.example.demo.presentation.view.fundamentals.fragment.header.ViewHeader;
import com.example.demo.presentation.view.fundamentals.layout.BaseViewLayout;
import com.example.demo.presentation.view.useradmin.dialog.register.view.UserRegisterDialog;
import com.example.demo.presentation.view.useradmin.root.presenter.IUserAdminPresenter;
import com.example.demo.presentation.view.useradmin.root.presenter.IUserAdminView;
import com.vaadin.navigator.View;
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
        this.presenter = presenter;
        setCaption(CAPTION);

        addHeaderAndBody(viewHeader, viewBody);

        viewBody.controlArea.addClickEventListenerToAddButton(event -> presenter.clickAddButton());
        viewBody.userSummaryGrid.addSelectionListener(event -> presenter.selectGrid(new UserSummaries(event.getAllSelectedItems())));
    }

    @PostConstruct
    void init() {
        presenter.attachView(this);
    }

    @Override
    public void activateEditButton() {
        viewBody.controlArea.activateEditButton();
    }

    @Override
    public void deactivateEditButton() {
        viewBody.controlArea.deactivateEditButton();
    }

    @Override
    public void activateDeleteButton() {
        viewBody.controlArea.activateDeleteButton();
        ;
    }

    @Override
    public void deactivateDeleteButton() {
        viewBody.controlArea.deactivateDeleteButton();
    }

    @Override
    public void clearAllGridSelections() {
        viewBody.userSummaryGrid.deselectAll();
    }

    @Override
    public void launchUserRegisterDialog() {
        getUI().getNavigator().navigateTo(UserRegisterDialog.VIEW_NAME);
    }
}
