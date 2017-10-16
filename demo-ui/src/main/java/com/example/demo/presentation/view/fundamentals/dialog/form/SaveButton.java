package com.example.demo.presentation.view.fundamentals.dialog.form;

import com.vaadin.ui.Button;
import com.vaadin.ui.themes.ValoTheme;

class SaveButton extends Button {
    static final String ID = "SaveButton";

    SaveButton() {
        setId(ID);
        setCaption("Save");
        setWidth(120, Unit.PIXELS);
        addStyleNames(ValoTheme.BUTTON_FRIENDLY);
    }
}
