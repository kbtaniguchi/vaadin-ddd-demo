package com.example.demo.presentation.view.fundamentals.fragment.dialog.message;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;

public class OkCancelButtons extends HorizontalLayout {
    final OkButton okButton = new OkButton();
    final CancelButton cancelButton = new CancelButton();

    public OkCancelButtons() {
        HorizontalLayout buttons = new HorizontalLayout(okButton, cancelButton);
        buttons.setMargin(false);
        addComponent(buttons);
        setComponentAlignment(buttons, Alignment.MIDDLE_CENTER);
        setSizeFull();
    }

    public void addClickEvenListenerToOkButton(ClickListener clickListener) {
        okButton.addClickListener(clickListener);
    }

    public void addClickEventListenerToCancelButton(ClickListener clickListener) {
        cancelButton.addClickListener(clickListener);
    }
}
