package com.example.demo.presentation.view.useradmin.dialog.edit.view;

import com.example.demo.domain.model.user.profile.EmailAddress;
import com.vaadin.data.BeanValidationBinder;
import com.vaadin.ui.TextField;

class EmailAddressEditField extends TextField {
    final BeanValidationBinder<EmailAddress> binder = new BeanValidationBinder<>(EmailAddress.class);
    final EmailAddress origin;

    EmailAddressEditField(EmailAddress origin) {
        this.origin = origin;
        setValue(origin.asText());

        setCaption(EmailAddress.caption());
        setSizeFull();
        binder.bind(this, EmailAddress.propertyName());
    }

    boolean hasChanges() {
        EmailAddress now = valueAsEmailAddress();
        return !origin.same(now);
    }

    EmailAddress valueAsEmailAddress() {
        return new EmailAddress(getValue());
    }
}
