package com.example.demo.presentation.view.useradmin.dialog.register.view;

import com.example.demo.domain.model.user.profile.UserName;
import com.vaadin.data.BeanValidationBinder;
import com.vaadin.ui.TextField;

class UserNameInputField extends TextField {
    static final String ID = "UserNameInputField";

    final BeanValidationBinder<UserName> binder = new BeanValidationBinder<>(UserName.class);

    UserNameInputField() {
        setId(ID);
        setCaption(UserName.caption());
        setSizeFull();
        binder.bind(this, UserName.propertyName());
    }

    UserName valueAsUserName() {
        return new UserName(getValue());
    }
}
