package com.example.demo.presentation.view.useradmin.dialog.register.view;

import com.example.demo.presentation.view.useradmin.dialog.register.view.button.SaveCancelButtonSet;
import com.example.demo.presentation.view.useradmin.dialog.register.view.form.InputForm;
import com.example.demo.presentation.view.useradmin.dialog.register.view.message.ErrorMessageLabel;
import com.vaadin.ui.VerticalLayout;

public class Body extends VerticalLayout {
    final InputForm inputForm = new InputForm();
    final ErrorMessageLabel errorLabel = new ErrorMessageLabel();
    final SaveCancelButtonSet buttonBar = new SaveCancelButtonSet();

    public Body() {
        addComponents(inputForm, errorLabel, buttonBar);
    }
}
