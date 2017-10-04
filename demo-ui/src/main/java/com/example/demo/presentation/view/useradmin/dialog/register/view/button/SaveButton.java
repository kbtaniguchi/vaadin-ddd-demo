package com.example.demo.presentation.view.useradmin.dialog.register.view.button;

import com.vaadin.ui.Button;
import com.vaadin.ui.themes.ValoTheme;

class SaveButton extends Button {
    final String caption = "Save";

    SaveButton() {
        setCaption(caption);
        setWidth(90, Unit.PIXELS);
        addStyleNames(ValoTheme.BUTTON_FRIENDLY);
    }
}
