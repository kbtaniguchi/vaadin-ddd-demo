package com.example.demo.presentation.view.useradmin.dialog.register.view;

import com.example.demo.domain.model.user.UserName;
import com.vaadin.data.BeanValidationBinder;
import com.vaadin.ui.TextField;

class UserNameInputField extends TextField {
    final BeanValidationBinder<UserName> binder = new BeanValidationBinder<>(UserName.class);

    UserNameInputField() {
        setCaption(UserName.caption());
        setSizeFull();
        binder.bind(this, UserName.propertyName());
    }
}
