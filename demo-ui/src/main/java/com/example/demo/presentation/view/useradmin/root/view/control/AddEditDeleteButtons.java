package com.example.demo.presentation.view.useradmin.root.view.control;

import com.example.demo.presentation.view.fundamentals.fragment.button.AddButton;
import com.example.demo.presentation.view.fundamentals.fragment.button.DeleteButton;
import com.example.demo.presentation.view.fundamentals.fragment.button.EditButton;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.themes.ValoTheme;

class AddEditDeleteButtons extends CssLayout {
    final AddButton addButton = new AddButton();
    final EditButton editButton = new EditButton();
    final DeleteButton deleteButton = new DeleteButton();

    AddEditDeleteButtons() {
        addComponents(addButton, editButton, deleteButton);
        addStyleName(ValoTheme.LAYOUT_COMPONENT_GROUP);

        editButton.setEnabled(false);
        deleteButton.setEnabled(false);
    }
}
