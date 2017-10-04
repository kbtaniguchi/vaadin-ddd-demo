package com.example.demo.presentation.view.useradmin.dialog.register.view;

import com.example.demo.presentation.view.useradmin.dialog.register.presenter.IUserRegisterDialog;
import com.example.demo.presentation.view.useradmin.dialog.register.presenter.IUserRegisterPresenter;
import com.example.demo.presentation.view.useradmin.root.view.UserAdminView;
import com.vaadin.navigator.View;
import com.vaadin.shared.ui.window.WindowMode;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

@SpringView(name = UserRegisterDialog.VIEW_NAME)
public class UserRegisterDialog extends Window implements View, IUserRegisterDialog {
    public static final String VIEW_NAME = "UserRegisterDialog";
    public static final String CAPTION = "User Register Dialog";

    final Body body = new Body();

    final IUserRegisterPresenter presenter;

    @Autowired
    public UserRegisterDialog(IUserRegisterPresenter presenter) {
        this.presenter = presenter;
        buildLayout();
        bindEventListener();
    }

    private void buildLayout() {
        setCaption(CAPTION);
        setModal(true);
        setResizable(false);
        setWidth(500, Unit.PIXELS);
        setWindowMode(WindowMode.NORMAL);
        setContent(body);
    }

    private void bindEventListener() {
        body.buttonBar.addClickEvenListenerToSaveButton(event -> presenter.clickSaveButton(body.inputForm.valueAsUser()));
        body.buttonBar.addClickEventListenerToCancelButton(event -> presenter.clickCancelButton());
    }

    @PostConstruct
    void init() {
        presenter.attachView(this);
    }

    @Override
    public boolean hasValidationErrors() {
        return !body.inputForm.validate();
    }

    @Override
    public void showValidationErrorMessages() {
        body.errorLabel.setMessageAsHtml(body.inputForm.errorMessagesAsHtml());
        body.errorLabel.setVisible(true);
    }

    @Override
    public void returnUserAdminView() {
        close();
        UI.getCurrent().getNavigator().navigateTo(UserAdminView.VIEW_NAME); // note: getUI() return null
    }
}
