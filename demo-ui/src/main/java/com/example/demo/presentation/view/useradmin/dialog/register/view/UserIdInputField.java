package com.example.demo.presentation.view.useradmin.dialog.register.view;

import com.example.demo.domain.model.user.profile.UserId;
import com.vaadin.data.BeanValidationBinder;
import com.vaadin.ui.TextField;

class UserIdInputField extends TextField {
    static final String ID = "UserIdInputField";

    final BeanValidationBinder<UserId> binder = new BeanValidationBinder<>(UserId.class);

    UserIdInputField() {
        setId(ID);
        setCaption(UserId.caption());
        setSizeFull();
        binder.bind(this, UserId.propertyName());
    }

    UserId valueAsUserId() {
        return new UserId(getValue());
    }
}
