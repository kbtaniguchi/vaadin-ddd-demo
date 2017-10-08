package com.example.demo.presentation.view.fundamentals.fragment.dialog.confirm;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;

class OkCancelButtons extends HorizontalLayout {
    final OkButton okButton = new OkButton();
    final CancelButton cancelButton = new CancelButton();

    OkCancelButtons() {
        HorizontalLayout buttons = new HorizontalLayout(okButton, cancelButton);
        buttons.setMargin(false);
        addComponent(buttons);
        setComponentAlignment(buttons, Alignment.MIDDLE_CENTER);
        setSizeFull();
    }
}
