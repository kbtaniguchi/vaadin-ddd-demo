package com.example.demo.presentation.view.useradmin.root.view.control;

import com.vaadin.ui.TextField;

class SearchTextField extends TextField {
    final static String ID = "SearchTextField";

    SearchTextField() {
        setId(ID);
        setPlaceholder("id, name, email");
    }
}
