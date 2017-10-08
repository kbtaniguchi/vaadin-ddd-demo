package com.example.demo.presentation.view.useradmin.dialog.register.view;

import com.example.demo.domain.model.user.EmailAddress;
import com.vaadin.data.BeanValidationBinder;
import com.vaadin.ui.TextField;

class EmailAddressInputField extends TextField {
    final BeanValidationBinder<EmailAddress> binder = new BeanValidationBinder<>(EmailAddress.class);

    EmailAddressInputField() {
        setCaption(EmailAddress.caption());
        setSizeFull();
        binder.bind(this, EmailAddress.propertyName());
    }
}
