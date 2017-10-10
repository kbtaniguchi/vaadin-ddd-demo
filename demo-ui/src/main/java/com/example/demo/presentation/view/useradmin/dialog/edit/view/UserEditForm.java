package com.example.demo.presentation.view.useradmin.dialog.edit.view;

import com.example.demo.domain.model.user.UserRegister;
import com.example.demo.domain.model.user.profile.UserProfile;
import com.example.demo.domain.model.user.summary.UserSummary;
import com.vaadin.server.CompositeErrorMessage;
import com.vaadin.ui.FormLayout;

class UserEditForm extends FormLayout {
    UserIdReadOnlyField userId;
    UserNameEditField userName;
    EmailAddressEditField emailAddress;

    UserEditForm(UserSummary targetSummary) {
        this.userId = new UserIdReadOnlyField(targetSummary.profile().userId());
        this.userName = new UserNameEditField(targetSummary.profile().userName());
        this.emailAddress = new EmailAddressEditField(targetSummary.profile().emailAddress());

        addComponents(userId, userName, emailAddress);
        setMargin(false);
    }

    void validate() {
        userName.binder.validate();
        emailAddress.binder.validate();
    }

    boolean hasValidationErrors() {
        return !allFieldsAreValid();
    }

    private boolean allFieldsAreValid() {
        return userName.binder.isValid() && emailAddress.binder.isValid();
    }

    boolean hasChanges() {
        // note: binder.setBean() and binder.hasChange() are not work I expected
        return userName.hasChanges() || emailAddress.hasChanges();
    }

    String errorMessagesAsHtml() {
        // note: getErrorMessage() always return null before binder.validate()
        CompositeErrorMessage compositeErrorMessage = new CompositeErrorMessage(
                userName.getErrorMessage(),
                emailAddress.getErrorMessage());
        return String.format("%s<br/>%s",
                compositeErrorMessage.getErrorLevel().getText(),
                compositeErrorMessage.getFormattedHtmlMessage());
    }

    UserRegister valueAsUser() {
        return new UserRegister(
                new UserProfile(
                        userId.valueAsUserId(),
                        userName.valueAsUserName(),
                        emailAddress.valueAsEmailAddress()));
    }
}
