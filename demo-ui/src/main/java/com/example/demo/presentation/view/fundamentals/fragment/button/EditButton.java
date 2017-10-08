package com.example.demo.presentation.view.fundamentals.fragment.button;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.Button;
import com.vaadin.ui.themes.ValoTheme;

public class EditButton extends Button {
    public EditButton() {
        setIcon(VaadinIcons.EDIT, "Edit");
        addStyleName(ValoTheme.BUTTON_ICON_ONLY);
    }
}
