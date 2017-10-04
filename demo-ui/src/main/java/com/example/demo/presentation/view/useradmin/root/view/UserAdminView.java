package com.example.demo.presentation.view.useradmin.root.view;

import com.example.demo.presentation.view.fundamentals.fragment.header.Header;
import com.example.demo.presentation.view.fundamentals.layout.BaseViewLayout;
import com.example.demo.presentation.view.useradmin.root.presenter.IUserAdminPresenter;
import com.example.demo.presentation.view.useradmin.root.presenter.IUserAdminView;
import com.example.demo.presentation.view.useradmin.dialog.register.view.UserRegisterDialog;
import com.vaadin.navigator.View;
import com.vaadin.spring.annotation.SpringView;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

@SpringView(name = UserAdminView.VIEW_NAME)
public class UserAdminView extends BaseViewLayout implements View, IUserAdminView {
    public static final String VIEW_NAME = "UserAdminView";
    public static final String CAPTION = "User Admin";

    Header header = new Header(CAPTION);
    Body body = new Body();

    @Autowired
    IUserAdminPresenter presenter;

    @PostConstruct
    void init() {
        presenter.attachView(this);

        addHeaderAndBody(header, body);
        setCaption(CAPTION);

        bindEventListener();
    }

    private void bindEventListener() {
        body.controlBar.addClickEventListenerToRegisterButton(event -> presenter.clickRegisterButton());
    }

    @Override
    public void launchUserRegisterDialog() {
        getUI().getNavigator().navigateTo(UserRegisterDialog.VIEW_NAME);
    }
}
