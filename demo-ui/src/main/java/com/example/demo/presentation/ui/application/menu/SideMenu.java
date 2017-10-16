package com.example.demo.presentation.ui.application.menu;

import com.vaadin.navigator.View;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.themes.ValoTheme;

public class SideMenu extends CssLayout {
    final Title title = new Title();
    final ToTopViewButton toTopViewButton = new ToTopViewButton();
    final ToUserAdminViewButton toUserAdminViewButton = new ToUserAdminViewButton();

    public SideMenu() {
        setPrimaryStyleName(ValoTheme.MENU_ROOT);
        addComponents(title, toTopViewButton, toUserAdminViewButton);
    }

    public void selectedItemRelatedTo(View activeView) {
        allSelectedClear();
        selectedBy(activeView.getViewComponent().getCaption());
    }

    private void allSelectedClear() {
        toTopViewButton.unselected();
        toUserAdminViewButton.unselected();
    }

    private void selectedBy(String activeViewCaption) {
        if (activeViewCaption.equals(toTopViewButton.getCaption())) toTopViewButton.selected();
        if (activeViewCaption.equals(toUserAdminViewButton.getCaption())) toUserAdminViewButton.selected();
    }
}
