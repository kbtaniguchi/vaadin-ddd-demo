package com.example.demo.presentation.view.useradmin.root.view;

import com.example.demo.presentation.view.useradmin.root.view.control.ControlButtonSet;
import com.example.demo.presentation.view.useradmin.root.view.grid.UserSummaryGrid;
import com.example.demo.presentation.view.useradmin.root.view.search.SearchPanel;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;

class Body extends VerticalLayout {
    final ControlButtonSet controlButtonSet = new ControlButtonSet();
    final SearchPanel searchPanel = new SearchPanel();
    final UserSummaryGrid userSummaryGrid = new UserSummaryGrid();

    Body() {
        setSizeFull();
        setMargin(false);

        HorizontalLayout layout = new HorizontalLayout(controlButtonSet, searchPanel);
        layout.setComponentAlignment(controlButtonSet, Alignment.BOTTOM_LEFT);
        addComponents(layout, userSummaryGrid);
        setExpandRatio(userSummaryGrid, 1.0f);
    }
}
