package com.example.demo.presentation.view.useradmin.dialog.register.view.form;

import com.example.demo.domain.model.user.User;
import com.vaadin.server.CompositeErrorMessage;
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

    public boolean validate() {
        userId.binder.validate();
        userName.binder.validate();
        emailAddress.binder.validate();
        return userId.binder.isValid() && userName.binder.isValid() && emailAddress.binder.isValid();
    }

    public String errorMessagesAsHtml() {
        // note: getErrorMessage() always return null before binder.validate()
        CompositeErrorMessage compositeErrorMessage = new CompositeErrorMessage(
                userId.getErrorMessage(),
                userName.getErrorMessage(),
                emailAddress.getErrorMessage());
        return String.format("%s<br/>%s",
                compositeErrorMessage.getErrorLevel().getText(),
                compositeErrorMessage.getFormattedHtmlMessage());
    }

    public User valueAsUser() {
        return new User(
                userId.binder.getBean(),
                userName.binder.getBean(),
                emailAddress.binder.getBean());
    }
}
