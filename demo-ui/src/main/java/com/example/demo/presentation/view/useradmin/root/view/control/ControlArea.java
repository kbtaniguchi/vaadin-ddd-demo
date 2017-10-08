package com.example.demo.presentation.view.useradmin.root.view.control;

import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;

public class ControlArea extends HorizontalLayout {
    final SearchField searchField = new SearchField();
    final AddDeleteButtons addDeleteButtons = new AddDeleteButtons();

    public ControlArea() {
        addComponents(searchField, addDeleteButtons);
    }

    public void addClickEventListenerToAddButton(ClickListener clickListener) {
        addDeleteButtons.addButton.addClickListener(clickListener);
    }
}
