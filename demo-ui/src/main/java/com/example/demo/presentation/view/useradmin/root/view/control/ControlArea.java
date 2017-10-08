package com.example.demo.presentation.view.useradmin.root.view.control;

import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;

public class ControlArea extends HorizontalLayout {
    final SearchField searchField = new SearchField();
    final AddEditDeleteButtons addEditDeleteButtons = new AddEditDeleteButtons();

    public ControlArea() {
        addComponents(searchField, addEditDeleteButtons);
    }

    public void addClickEventListenerToAddButton(ClickListener clickListener) {
        addEditDeleteButtons.addButton.addClickListener(clickListener);
    }

    public void activateEditButton() {
        addEditDeleteButtons.editButton.setEnabled(true);
    }

    public void deactivateEditButton() {
        addEditDeleteButtons.editButton.setEnabled(false);
    }

    public void activateDeleteButton() {
        addEditDeleteButtons.deleteButton.setEnabled(true);
    }

    public void deactivateDeleteButton() {
        addEditDeleteButtons.deleteButton.setEnabled(false);
    }
}
