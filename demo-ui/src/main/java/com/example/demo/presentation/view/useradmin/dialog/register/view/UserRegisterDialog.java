package com.example.demo.presentation.view.useradmin.dialog.register.view;

import com.example.demo.presentation.view.fundamentals.dialog.form.FormDialog;
import com.example.demo.presentation.view.useradmin.dialog.register.presenter.IUserRegisterDialog;
import com.example.demo.presentation.view.useradmin.dialog.register.presenter.IUserRegisterPresenter;
import com.example.demo.presentation.view.useradmin.root.view.UserAdminView;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.UI;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

@SpringView(name = UserRegisterDialog.VIEW_NAME)
public class UserRegisterDialog extends FormDialog implements View, IUserRegisterDialog {
    public static final String VIEW_NAME = "UserRegisterDialog";

    UserRegisterForm form = new UserRegisterForm();

    IUserRegisterPresenter presenter;

    @Autowired
    public UserRegisterDialog(IUserRegisterPresenter presenter) {
        super("User Register Dialog");
        this.presenter = presenter;

        setForm(form);
    }

    @PostConstruct
    void init() {
        presenter.attachView(this);
    }

    @Override
    public void enter(ViewChangeEvent event) {
        addClickEvenListenerToSaveButton(e -> presenter.onClickSaveButton(form.valueAsUserRegister()));
        addClickEventListenerToCancelButton(e -> presenter.onClickCancelButton());
    }

    @Override
    public boolean hasValidationErrors() {
        return form.hasValidationErrors();
    }

    @Override
    public void showValidationErrorMessages() {
        form.validate();
        setErrorMessageAsHtml(form.errorMessagesAsHtml());
        setVisibleOfErrorDisplay(true);
    }

    @Override
    public void hideErrorMessages() {
        setVisibleOfErrorDisplay(false);
    }

    @Override
    public void returnUserAdminView() {
        // note: getUI() return null
        close();
        UI.getCurrent().getNavigator().navigateTo(UserAdminView.VIEW_NAME);
    }
}
