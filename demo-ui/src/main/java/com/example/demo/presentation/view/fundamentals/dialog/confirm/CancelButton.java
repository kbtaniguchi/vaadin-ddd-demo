package com.example.demo.presentation.view.fundamentals.dialog.confirm;

import com.vaadin.ui.Button;

class CancelButton extends Button {
    static final String ID = "CancelButton";

    CancelButton() {
        setId(ID);
        setCaption("Cancel");
        setWidth(120, Unit.PIXELS);
    }
}
