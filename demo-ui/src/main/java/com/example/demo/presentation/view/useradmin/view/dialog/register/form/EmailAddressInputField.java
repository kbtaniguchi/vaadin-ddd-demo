package com.example.demo.presentation.view.useradmin.view.dialog.register.form;

import com.example.demo.domain.model.user.EmailAddress;
import com.vaadin.data.BeanValidationBinder;
import com.vaadin.ui.TextField;

class EmailAddressInputField extends TextField {
    final String caption = "Email Address";
    final BeanValidationBinder<EmailAddress> binder = new BeanValidationBinder<>(EmailAddress.class);

    EmailAddressInputField() {
        setCaption(caption);
        setSizeFull();
        binder.bind(this, "value");
    }

    boolean isValid() {
        return binder.isValid();
    }

    EmailAddress getValueAsEmailAddress() {
        return binder.getBean();
    }
}
