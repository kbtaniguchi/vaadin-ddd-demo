package com.example.demo.presentation.view.useradmin.root.view.control;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.Button;
import com.vaadin.ui.themes.ValoTheme;

class UserDeleteButton extends Button {
    UserDeleteButton() {
        setIcon(VaadinIcons.TRASH, "Delete");
        addStyleName(ValoTheme.BUTTON_DANGER);
    }
}
