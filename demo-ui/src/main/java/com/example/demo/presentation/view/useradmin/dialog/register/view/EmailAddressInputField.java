package com.example.demo.presentation.view.useradmin.dialog.register.view;

import com.example.demo.domain.model.user.profile.EmailAddress;
import com.vaadin.data.BeanValidationBinder;
import com.vaadin.ui.TextField;

class EmailAddressInputField extends TextField {
    static final String ID = "EmailAddressInputField";

    final BeanValidationBinder<EmailAddress> binder = new BeanValidationBinder<>(EmailAddress.class);

    EmailAddressInputField() {
        setId(ID);
        setCaption(EmailAddress.caption());
        setSizeFull();
        binder.bind(this, EmailAddress.propertyName());
    }

    EmailAddress valueAsEmailAddress() {
        return new EmailAddress(getValue());
    }
}
