package com.example.demo.presentation.view.useradmin.root.view;

import com.example.demo.presentation.view.useradmin.root.view.control.GridControlArea;
import com.example.demo.presentation.view.useradmin.root.view.grid.UserSummaryGrid;
import com.vaadin.ui.VerticalLayout;

class UserAdminViewBody extends VerticalLayout {
    final GridControlArea gridControlArea = new GridControlArea();
    final UserSummaryGrid userSummaryGrid = new UserSummaryGrid();

    UserAdminViewBody() {
        setSizeFull();
        setMargin(false);

        addComponents(gridControlArea, userSummaryGrid);
        setExpandRatio(userSummaryGrid, 1.0f);
    }
}
