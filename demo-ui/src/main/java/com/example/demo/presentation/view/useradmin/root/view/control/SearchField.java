package com.example.demo.presentation.view.useradmin.root.view.control;

import com.vaadin.ui.CssLayout;
import com.vaadin.ui.themes.ValoTheme;

class SearchField extends CssLayout {
    final SearchTextField searchText = new SearchTextField();
    final SearchButton searchButton = new SearchButton();

    SearchField() {
        addComponents(searchText, searchButton);
        addStyleName(ValoTheme.LAYOUT_COMPONENT_GROUP);
    }
}
