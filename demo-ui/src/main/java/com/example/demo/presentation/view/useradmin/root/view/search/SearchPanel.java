package com.example.demo.presentation.view.useradmin.root.view.search;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.themes.ValoTheme;

public class SearchPanel extends Panel {
    final UserIdSearchField userId = new UserIdSearchField();
    final UserNameSearchField userName = new UserNameSearchField();
    final EmailAddressSearchField emailAddress = new EmailAddressSearchField();
    final SearchButton searchButton = new SearchButton();

    public SearchPanel() {
        HorizontalLayout layout = new HorizontalLayout(userId, userName, emailAddress, searchButton);
        layout.setComponentAlignment(searchButton, Alignment.BOTTOM_RIGHT);
        setContent(layout);
        addStyleName(ValoTheme.PANEL_BORDERLESS);
    }
}
