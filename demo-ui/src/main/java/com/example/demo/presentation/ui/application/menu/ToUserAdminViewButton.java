package com.example.demo.presentation.ui.application.menu;

import com.example.demo.presentation.view.useradmin.root.view.UserAdminView;
import com.vaadin.ui.Button;
import com.vaadin.ui.themes.ValoTheme;

class ToUserAdminViewButton extends Button {
    static String id = "ToUserAdminViewButton";

    ToUserAdminViewButton() {
        setId(id);
        setCaption(UserAdminView.CAPTION);
        setPrimaryStyleName(ValoTheme.MENU_ITEM);
        addClickListener(event -> getUI().getNavigator().navigateTo(UserAdminView.VIEW_NAME));
    }

    void selected() {
        addStyleName("selected");
    }

    void unselected() {
        removeStyleName("selected");
    }
}
