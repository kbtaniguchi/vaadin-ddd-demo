package com.example.demo.presentation.view.useradmin.root.view.control;

import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;

public class GridControlArea extends HorizontalLayout {
    final SearchField searchField = new SearchField();
    final AddDeleteButtons addDeleteButtons = new AddDeleteButtons();

    public GridControlArea() {
        addComponents(searchField, addDeleteButtons);
    }

    public void addClickEventListenerToAddButton(ClickListener clickListener) {
        addDeleteButtons.addButton.addClickListener(clickListener);
    }
}
