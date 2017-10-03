package com.example.demo.presentation.view.useradmin.view;

import com.example.demo.presentation.view.useradmin.view.control.ControlBar;
import com.example.demo.presentation.view.useradmin.view.grid.UserSummaryListGrid;
import com.example.demo.presentation.view.useradmin.view.search.SearchPanel;
import com.vaadin.ui.VerticalLayout;

class Body extends VerticalLayout {
    final ControlBar controlBar = new ControlBar();
    final SearchPanel searchPanel = new SearchPanel();
    final UserSummaryListGrid userSummaryListGrid = new UserSummaryListGrid();

    Body() {
        setSizeFull();
        addComponents(controlBar, searchPanel, userSummaryListGrid);
        setExpandRatio(userSummaryListGrid, 1.0f);
    }
}