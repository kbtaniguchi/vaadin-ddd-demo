package com.example.demo.presentation.view.useradmin.view.search;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.themes.ValoTheme;

public class SearchPanel extends Panel {
    final UserNameSearchField userNameSearchField = new UserNameSearchField();
    final EmailAddressSearchField emailAddressText = new EmailAddressSearchField();
    final SearchButton searchButton = new SearchButton();

    public SearchPanel() {
        HorizontalLayout layout = new HorizontalLayout(userNameSearchField, emailAddressText, searchButton);
        layout.setComponentAlignment(searchButton, Alignment.BOTTOM_RIGHT);
        setContent(layout);
        addStyleName(ValoTheme.PANEL_BORDERLESS);
    }
}
