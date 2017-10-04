package com.example.demo.presentation.view.useradmin.dialog.register.view.button;

import com.vaadin.ui.Button;

class CancelButton extends Button {
    final String caption = "Cancel";

    CancelButton() {
        setCaption(caption);
        setWidth(90, Unit.PIXELS);
    }
}
