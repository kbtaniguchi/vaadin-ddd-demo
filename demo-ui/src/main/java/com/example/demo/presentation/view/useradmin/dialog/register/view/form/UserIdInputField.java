package com.example.demo.presentation.view.useradmin.dialog.register.view.form;

import com.example.demo.domain.model.user.UserId;
import com.vaadin.data.BeanValidationBinder;
import com.vaadin.ui.TextField;

class UserIdInputField extends TextField {
    final BeanValidationBinder<UserId> binder = new BeanValidationBinder<>(UserId.class);

    UserIdInputField() {
        setCaption("User Id");
        setSizeFull();
        binder.bind(this, "value");
    }
}
