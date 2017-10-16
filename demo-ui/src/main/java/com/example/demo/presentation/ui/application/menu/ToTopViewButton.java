package com.example.demo.presentation.ui.application.menu;

import com.example.demo.presentation.view.top.view.TopView;
import com.vaadin.ui.Button;
import com.vaadin.ui.themes.ValoTheme;

class ToTopViewButton extends Button {
    final static String ID = "ToTopViewButton";

    ToTopViewButton() {
        setId(ID);
        setCaption(TopView.CAPTION);
        setPrimaryStyleName(ValoTheme.MENU_ITEM);
        addClickListener(event -> getUI().getNavigator().navigateTo(TopView.VIEW_NAME));
    }

    void selected() {
        addStyleName("selected");
    }

    void unselected() {
        removeStyleName("selected");
    }
}
