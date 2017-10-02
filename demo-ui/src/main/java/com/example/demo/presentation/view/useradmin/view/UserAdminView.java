package com.example.demo.presentation.view.useradmin.view;

import com.example.demo.presentation.view.base.fragment.header.Header;
import com.example.demo.presentation.view.base.layout.BaseViewLayout;
import com.example.demo.presentation.view.useradmin.presenter.IUserAdminPresenter;
import com.example.demo.presentation.view.useradmin.presenter.IUserAdminView;
import com.example.demo.presentation.view.useradmin.view.dialog.register.UserRegisterDialog;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
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
    public void enter(ViewChangeEvent event) {
        // This view is constructed in the init() method()
    }

    @Override
    public void launchUserRegisterDialog() {
        getUI().getNavigator().navigateTo(UserRegisterDialog.VIEW_NAME);
    }
}
