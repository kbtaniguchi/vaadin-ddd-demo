package com.example.demo.presentation.view.useradmin.dialog.edit.view;

import com.example.demo.domain.model.user.UserName;
import com.vaadin.data.BeanValidationBinder;
import com.vaadin.ui.TextField;

class UserNameEditField extends TextField {
    final BeanValidationBinder<UserName> binder = new BeanValidationBinder<>(UserName.class);
    final UserName origin;

    UserNameEditField(UserName origin) {
        this.origin = origin;
        setValue(origin.asText());

        setCaption(UserName.caption());
        setSizeFull();
        binder.bind(this, UserName.propertyName());
    }

    boolean hasChanges() {
        UserName now = valueAsUserName();
        return !origin.same(now);
    }

    UserName valueAsUserName() {
        return new UserName(getValue());
    }
}
