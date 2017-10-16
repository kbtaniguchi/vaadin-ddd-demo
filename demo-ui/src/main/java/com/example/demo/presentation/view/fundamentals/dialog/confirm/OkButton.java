package com.example.demo.presentation.view.fundamentals.dialog.confirm;

import com.vaadin.ui.Button;

class OkButton extends Button {
    static final String ID = "OkButton";

    OkButton() {
        setId(ID);
        setCaption("Ok");
        setWidth(120, Unit.PIXELS);
    }
}
