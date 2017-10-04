package com.example.demo.presentation.view.useradmin.dialog.register.view.form;

import com.example.demo.domain.model.user.UserName;
import com.vaadin.data.BeanValidationBinder;
import com.vaadin.ui.TextField;

class UserNameInputField extends TextField {
    final String caption = "Name";
    final BeanValidationBinder<UserName> binder = new BeanValidationBinder<>(UserName.class);

    UserNameInputField() {
        setCaption(caption);
        setSizeFull();
        binder.bind(this, "value");
    }

    boolean isValid() {
        return binder.isValid();
    }

    UserName getValueAsUserName() {
        return binder.getBean();
    }
}
