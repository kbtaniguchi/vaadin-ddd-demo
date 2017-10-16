package com.example.demo.presentation.view.useradmin.root.view.control;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.Button;
import com.vaadin.ui.themes.ValoTheme;

class EditButton extends Button {
    static final String ID = "EditButton";

    EditButton() {
        setId(ID);
        setIcon(VaadinIcons.PENCIL, "Edit");
        addStyleName(ValoTheme.BUTTON_ICON_ONLY);
    }
}
