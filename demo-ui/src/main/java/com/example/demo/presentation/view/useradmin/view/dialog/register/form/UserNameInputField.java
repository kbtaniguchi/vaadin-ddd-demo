package com.example.demo.presentation.view.useradmin.view.dialog.register.form;

import com.vaadin.ui.TextField;

class UserNameInputField extends TextField {
    final String caption = "Name";

    public UserNameInputField() {
        setCaption(caption);
    }
}
