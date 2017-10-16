package com.example.demo.presentation.view.useradmin.root.view.control;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.Button;
import com.vaadin.ui.themes.ValoTheme;

class SearchButton extends Button {
    static final String ID = "SearchButton";

    SearchButton() {
        setId(ID);
        setIcon(VaadinIcons.SEARCH, "Search");
        addStyleName(ValoTheme.BUTTON_ICON_ONLY);
    }
}
