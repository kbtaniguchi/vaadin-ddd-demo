package com.example.demo.presentation.view.useradmin.root.view.control;

import com.example.demo.presentation.view.fundamentals.fragment.button.AddButton;
import com.example.demo.presentation.view.fundamentals.fragment.button.DeleteButton;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.themes.ValoTheme;

class AddDeleteButtons extends CssLayout {
    final AddButton addButton = new AddButton();
    final DeleteButton deleteButton = new DeleteButton();

    AddDeleteButtons() {
        addComponents(addButton, deleteButton);
        addStyleName(ValoTheme.LAYOUT_COMPONENT_GROUP);
    }
}
