package com.example.demo.presentation.view.useradmin.dialog.edit.view;

import com.example.demo.domain.model.user.UserId;
import com.vaadin.ui.TextField;

class UserIdReadOnlyField extends TextField {

    UserIdReadOnlyField(UserId origin) {
        setValue(origin.asText());
        setCaption(UserId.caption());
        setSizeFull();
        setReadOnly(true);
    }

    UserId valueAsUserId() {
        return new UserId(getValue());
    }
}
