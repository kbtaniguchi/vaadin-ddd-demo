package com.example.demo.presentation.view.fundamentals.fragment.button;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.Button;
import com.vaadin.ui.themes.ValoTheme;

public class AddButton extends Button {
    public AddButton() {
        setIcon(VaadinIcons.PLUS, "Register");
        addStyleName(ValoTheme.BUTTON_ICON_ONLY);
    }
}
