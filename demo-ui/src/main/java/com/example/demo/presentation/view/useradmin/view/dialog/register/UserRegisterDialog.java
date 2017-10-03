package com.example.demo.presentation.view.useradmin.view.dialog.register;

import com.example.demo.presentation.view.useradmin.presenter.dialog.IUserRegisterDialog;
import com.example.demo.presentation.view.useradmin.presenter.dialog.IUserRegisterPresenter;
import com.example.demo.presentation.view.useradmin.view.UserAdminView;
import com.example.demo.presentation.view.useradmin.view.dialog.register.button.ButtonBar;
import com.example.demo.presentation.view.useradmin.view.dialog.register.form.InputForm;
import com.vaadin.navigator.View;
import com.vaadin.shared.ui.window.WindowMode;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

@SpringView(name = UserRegisterDialog.VIEW_NAME)
public class UserRegisterDialog extends Window implements View, IUserRegisterDialog {
    public static final String VIEW_NAME = "UserRegisterDialog";
    public static final String CAPTION = "User Register Dialog";

    final InputForm inputForm = new InputForm();
    final Label errorLabel = new Label("Please enter valid values.");
    final ButtonBar buttonBar = new ButtonBar();

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
        setWidth(400, Unit.PIXELS);
        setWindowMode(WindowMode.NORMAL);

        errorLabel.setVisible(false);
        errorLabel.addStyleName("failure");
        errorLabel.setSizeFull();

        VerticalLayout layout = new VerticalLayout(inputForm, errorLabel, buttonBar);
        setContent(layout);
    }

    private void bindEventListener() {
        buttonBar.addClickEvenListenerToSaveButton(event -> presenter.clickSaveButton(inputForm.getValueAsUser()));
        buttonBar.addClickEventListenerToCancelButton(event -> presenter.clickCancelButton(inputForm.getValueAsUser()));
    }

    @PostConstruct
    void init() {
        presenter.attachView(this);
    }

    @Override
    public boolean isValid() {
        return inputForm.isValid();
    }

    @Override
    public void showErrorMessage() {
        errorLabel.setVisible(true);
    }

    @Override
    public void returnUserAdminView() {
        UI.getCurrent().getNavigator().navigateTo(UserAdminView.VIEW_NAME); // note: getUI() return null
    }

    @Override
    public void closeUserRegisterDialog() {
        close();
    }
}
