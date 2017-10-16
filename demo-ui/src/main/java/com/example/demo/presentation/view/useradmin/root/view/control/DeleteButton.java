package com.example.demo.presentation.view.useradmin.root.view.control;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.Button;
import com.vaadin.ui.themes.ValoTheme;

class DeleteButton extends Button {
    static final String ID = "DeleteButton";

    DeleteButton() {
        setId(ID);
        setIcon(VaadinIcons.TRASH, "Delete");
        addStyleName(ValoTheme.BUTTON_DANGER);
        addStyleName(ValoTheme.BUTTON_ICON_ONLY);
    }
}
