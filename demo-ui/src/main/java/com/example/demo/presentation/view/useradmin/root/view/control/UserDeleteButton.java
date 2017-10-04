package com.example.demo.presentation.view.useradmin.root.view.control;

import com.vaadin.ui.Button;
import com.vaadin.ui.themes.ValoTheme;

class UserDeleteButton extends Button {
    final String caption = "Delete";

    UserDeleteButton() {
        setCaption(caption);
        addStyleName(ValoTheme.BUTTON_DANGER);
    }
}
