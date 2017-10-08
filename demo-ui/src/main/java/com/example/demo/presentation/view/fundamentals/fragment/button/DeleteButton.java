package com.example.demo.presentation.view.fundamentals.fragment.button;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.Button;
import com.vaadin.ui.themes.ValoTheme;

public class DeleteButton extends Button {
    public DeleteButton() {
        setIcon(VaadinIcons.TRASH, "Delete");
        addStyleName(ValoTheme.BUTTON_DANGER);
    }
}
