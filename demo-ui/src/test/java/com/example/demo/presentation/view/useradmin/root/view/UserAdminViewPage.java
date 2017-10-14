package com.example.demo.presentation.view.useradmin.root.view;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class UserAdminViewPage {
    int gridDataCounter = 0;

    public UserAdminViewPage() {
        if (!title().equals(UserAdminView.CAPTION)) throw new IllegalStateException();
        this.gridDataCounter = $("table")
                .findAll(".v-grid-row").size();
    }

    public SelenideElement addButton() {
        return $$(".v-button").get(1);
    }

    public int countGridData() {
        return gridDataCounter;
    }
}
