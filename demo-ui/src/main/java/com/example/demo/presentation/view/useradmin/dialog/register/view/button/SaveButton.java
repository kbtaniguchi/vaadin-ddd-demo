package com.example.demo.presentation.view.useradmin.dialog.register.view.button;

import com.vaadin.ui.Button;
import com.vaadin.ui.themes.ValoTheme;

class SaveButton extends Button {
    SaveButton() {
        setCaption("Save");
        setWidth(120, Unit.PIXELS);
        addStyleNames(ValoTheme.BUTTON_FRIENDLY);
    }
}
