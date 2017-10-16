package com.example.demo.presentation.view.useradmin.root.view.control;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.Button;
import com.vaadin.ui.themes.ValoTheme;

class AddButton extends Button {
    static final String ID = "AddButton";

    AddButton() {
        setId(ID);
        setIcon(VaadinIcons.PLUS, "Register");
        addStyleName(ValoTheme.BUTTON_ICON_ONLY);
    }
}
