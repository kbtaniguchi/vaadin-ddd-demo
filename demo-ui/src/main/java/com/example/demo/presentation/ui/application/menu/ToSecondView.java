package com.example.demo.presentation.ui.application.menu;

import com.example.demo.presentation.view.second.SecondView;
import com.vaadin.ui.Button;
import com.vaadin.ui.themes.ValoTheme;

class ToSecondView extends Button {

    ToSecondView() {
        setCaption(SecondView.CAPTION);
        setPrimaryStyleName(ValoTheme.MENU_ITEM);
        addClickListener(event -> getUI().getNavigator().navigateTo(SecondView.VIEW_NAME));
    }

    void selected(boolean selected) {
        if (selected) addStyleName("selected");
        else removeStyleName("selected");
    }
}
