package com.example.demo.presentation.view.useradmin.root.view.control;

import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;

public class ControlBar extends HorizontalLayout {
    final UserRegisterButton registerButton = new UserRegisterButton();
    final UserEditButton editButton = new UserEditButton();
    final UserDeleteButton deleteButton = new UserDeleteButton();

    public ControlBar() {
        addComponents(registerButton, editButton, deleteButton);
    }

    public void addClickEventListenerToRegisterButton(ClickListener clickListener) {
        registerButton.addClickListener(clickListener);
    }
}
