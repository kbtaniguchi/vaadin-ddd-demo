package com.example.demo.presentation.view.useradmin.view.dialog.register.form;

import com.example.demo.domain.model.user.User;
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
        layout.setMargin(false);
        setContent(layout);
        addStyleName(ValoTheme.PANEL_BORDERLESS);
    }

    public boolean isValid() {
        return userId.isValid() && userName.isValid() && emailAddress.isValid();
    }

    public User getValueAsUser() {
        return new User(
                userId.getValueAsUserId(),
                userName.getValueAsUserName(),
                emailAddress.getValueAsEmailAddress());
    }
}
