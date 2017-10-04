package com.example.demo.presentation.view.useradmin.dialog.register.view.form;

import com.example.demo.domain.model.user.UserId;
import com.vaadin.data.BeanValidationBinder;
import com.vaadin.ui.TextField;

class UserIdInputField extends TextField {
    final String caption = "User Id";
    final BeanValidationBinder<UserId> binder = new BeanValidationBinder<>(UserId.class);

    UserIdInputField() {
        setCaption(caption);
        setSizeFull();
        binder.bind(this, "value");
    }

    boolean isValid() {
        return binder.isValid();
    }

    UserId getValueAsUserId() {
        return binder.getBean();
    }
}
