package com.example.demo.presentation.ui.application.menu;

import com.vaadin.navigator.View;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.themes.ValoTheme;

public class SideMenu extends CssLayout {
    final Title title = new Title();
    final ToTopView toTopView = new ToTopView();
    final ToSecondView toSecondView = new ToSecondView();

    public SideMenu() {
        setPrimaryStyleName(ValoTheme.MENU_ROOT);
        addComponents(title, toTopView, toSecondView);
    }

    public void selectedItemRelatedTo(View activeView) {
        allSelectedClear();
        selectedBy(activeView.getViewComponent().getCaption());
    }

    private void allSelectedClear() {
        toTopView.selected(false);
        toSecondView.selected(false);
    }

    private void selectedBy(String activeViewCaption) {
        if (activeViewCaption.equals(toTopView.getCaption())) toTopView.selected(true);
        if (activeViewCaption.equals(toSecondView.getCaption())) toSecondView.selected(true);
    }
}
