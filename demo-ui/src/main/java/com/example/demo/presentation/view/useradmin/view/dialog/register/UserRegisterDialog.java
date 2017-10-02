package com.example.demo.presentation.view.useradmin.view.dialog.register;

import com.example.demo.presentation.view.useradmin.presenter.dialog.IUserRegisterDialog;
import com.example.demo.presentation.view.useradmin.view.dialog.register.button.ButtonBar;
import com.example.demo.presentation.view.useradmin.view.dialog.register.form.InputForm;
import com.vaadin.navigator.View;
import com.vaadin.shared.ui.window.WindowMode;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

@SpringView(name = UserRegisterDialog.VIEW_NAME)
public class UserRegisterDialog extends Window implements View, IUserRegisterDialog {
    public static final String VIEW_NAME = "UserRegisterDialog";
    public static final String CAPTION = "User Register Dialog";

    final InputForm inputForm = new InputForm();
    final ButtonBar buttonBar = new ButtonBar();

    public UserRegisterDialog() {
        setCaption(CAPTION);
        setModal(true);
        setResizable(false);
        setWidth(400, Unit.PIXELS);
        setWindowMode(WindowMode.NORMAL);

        VerticalLayout layout = new VerticalLayout(inputForm, buttonBar);
        setContent(layout);
    }
}
