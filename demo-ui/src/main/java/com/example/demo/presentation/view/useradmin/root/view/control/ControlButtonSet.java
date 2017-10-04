package com.example.demo.presentation.view.useradmin.root.view.control;

import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.themes.ValoTheme;

public class ControlButtonSet extends CssLayout {
    final UserRegisterButton registerButton = new UserRegisterButton();
    final UserEditButton editButton = new UserEditButton();
    final UserDeleteButton deleteButton = new UserDeleteButton();

    public ControlButtonSet() {
        addStyleName(ValoTheme.LAYOUT_COMPONENT_GROUP);
        addComponents(registerButton, editButton, deleteButton);
    }

    public void addClickEventListenerToRegisterButton(ClickListener clickListener) {
        registerButton.addClickListener(clickListener);
    }
}
