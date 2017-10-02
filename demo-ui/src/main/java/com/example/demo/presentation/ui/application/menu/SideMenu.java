package com.example.demo.presentation.ui.application.menu;

import com.vaadin.navigator.View;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.themes.ValoTheme;

public class SideMenu extends CssLayout {
    final Title title = new Title();
    final ToTopView toTopView = new ToTopView();
    final ToUserAdminView toUserAdminView = new ToUserAdminView();

    public SideMenu() {
        setPrimaryStyleName(ValoTheme.MENU_ROOT);
        addComponents(title, toTopView, toUserAdminView);
    }

    public void selectedItemRelatedTo(View activeView) {
        allSelectedClear();
        selectedBy(activeView.getViewComponent().getCaption());
    }

    private void allSelectedClear() {
        toTopView.unselected();
        toUserAdminView.unselected();
    }

    private void selectedBy(String activeViewCaption) {
        if (activeViewCaption.equals(toTopView.getCaption())) toTopView.selected();
        if (activeViewCaption.equals(toUserAdminView.getCaption())) toUserAdminView.selected();
    }
}
