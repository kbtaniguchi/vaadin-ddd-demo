package com.example.demo.presentation.view.fundamentals.fragment.dialog.form;

import com.vaadin.ui.Button;
import com.vaadin.ui.themes.ValoTheme;

class SaveButton extends Button {
    SaveButton() {
        setCaption("Save");
        setWidth(120, Unit.PIXELS);
        addStyleNames(ValoTheme.BUTTON_FRIENDLY);
    }
}
