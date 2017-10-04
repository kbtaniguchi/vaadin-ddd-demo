package com.example.demo.presentation.view.useradmin.dialog.register.view.form;

import com.example.demo.domain.model.user.EmailAddress;
import com.vaadin.data.BeanValidationBinder;
import com.vaadin.ui.TextField;

class EmailAddressInputField extends TextField {
    final BeanValidationBinder<EmailAddress> binder = new BeanValidationBinder<>(EmailAddress.class);

    EmailAddressInputField() {
        setCaption("Email Address");
        setSizeFull();
        binder.bind(this, "value");
    }
}
