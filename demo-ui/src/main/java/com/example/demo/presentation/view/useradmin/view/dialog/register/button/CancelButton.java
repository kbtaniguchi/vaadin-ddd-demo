package com.example.demo.presentation.view.useradmin.view.dialog.register.button;

import com.vaadin.ui.Button;

class CancelButton extends Button {
    final String caption = "Cancel";

    CancelButton() {
        setCaption(caption);
        setWidth(90, Unit.PIXELS);
    }
}
