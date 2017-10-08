package com.example.demo.presentation.view.useradmin.root.view;

import com.example.demo.presentation.view.useradmin.root.view.control.ControlArea;
import com.example.demo.presentation.view.useradmin.root.view.grid.UserSummaryGrid;
import com.vaadin.ui.VerticalLayout;

class UserAdminViewBody extends VerticalLayout {
    final ControlArea controlArea = new ControlArea();
    final UserSummaryGrid userSummaryGrid = new UserSummaryGrid();

    UserAdminViewBody() {
        setSizeFull();
        setMargin(false);

        addComponents(controlArea, userSummaryGrid);
        setExpandRatio(userSummaryGrid, 1.0f);
    }
}
