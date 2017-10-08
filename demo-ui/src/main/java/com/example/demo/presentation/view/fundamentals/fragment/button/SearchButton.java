package com.example.demo.presentation.view.fundamentals.fragment.button;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.Button;
import com.vaadin.ui.themes.ValoTheme;

public class SearchButton extends Button {
    public SearchButton() {
        setIcon(VaadinIcons.SEARCH, "Search");
        addStyleName(ValoTheme.BUTTON_ICON_ONLY);
    }
}
