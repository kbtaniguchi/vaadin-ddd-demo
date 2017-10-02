package com.example.demo.presentation.view.useradmin.view.dialog.register.form;

import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.themes.ValoTheme;

public class InputForm extends Panel {
    final UserIdInputField userId = new UserIdInputField();
    final UserNameInputField userName = new UserNameInputField();
    final EmailAddressInputField emailAddress = new EmailAddressInputField();

    public InputForm() {
        FormLayout layout = new FormLayout();
        layout.addComponents(userId, userName, emailAddress);
        layout.addStyleName(ValoTheme.FORMLAYOUT_LIGHT);
        layout.setMargin(false);
        setContent(layout);
    }
}
