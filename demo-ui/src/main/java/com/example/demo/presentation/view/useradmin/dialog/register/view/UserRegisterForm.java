package com.example.demo.presentation.view.useradmin.dialog.register.view;

import com.example.demo.domain.model.user.User;
import com.vaadin.server.CompositeErrorMessage;
import com.vaadin.ui.FormLayout;

class UserRegisterForm extends FormLayout {
    final UserIdInputField userId = new UserIdInputField();
    final UserNameInputField userName = new UserNameInputField();
    final EmailAddressInputField emailAddress = new EmailAddressInputField();

    UserRegisterForm() {
        addComponents(userId, userName, emailAddress);
        setMargin(false);
    }

    void validate() {
        userId.binder.validate();
        userName.binder.validate();
        emailAddress.binder.validate();
    }

    boolean hasValidationErrors() {
        return !allFieldsAreValid();
    }

    private boolean allFieldsAreValid() {
        return userId.binder.isValid() && userName.binder.isValid() && userName.binder.isValid();
    }

    String errorMessagesAsHtml() {
        // note: getErrorMessage() always return null before binder.validate()
        CompositeErrorMessage compositeErrorMessage = new CompositeErrorMessage(
                userId.getErrorMessage(),
                userName.getErrorMessage(),
                emailAddress.getErrorMessage());
        return String.format("%s<br/>%s",
                compositeErrorMessage.getErrorLevel().getText(),
                compositeErrorMessage.getFormattedHtmlMessage());
    }

    User valueAsUser() {
        return new User(
                userId.binder.getBean(),
                userName.binder.getBean(),
                emailAddress.binder.getBean());
    }
}
