package com.example.demo.presentation.view.useradmin.dialog.edit.view;

import com.example.demo.domain.model.user.UserId;
import com.vaadin.data.BeanValidationBinder;
import com.vaadin.ui.TextField;

class UserIdReadOnlyField extends TextField {
    final BeanValidationBinder<UserId> binder = new BeanValidationBinder<>(UserId.class);

    UserIdReadOnlyField(UserId origin) {
        setCaption(UserId.caption());
        setSizeFull();
        setReadOnly(true);
        binder.bind(this, UserId.propertyName());
        binder.setBean(origin);
    }

    UserId valueAsUserId() {
        return new UserId(getValue());
    }
}
