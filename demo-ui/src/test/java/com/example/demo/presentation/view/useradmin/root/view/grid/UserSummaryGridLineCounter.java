package com.example.demo.presentation.view.useradmin.root.view.grid;

import static com.codeborne.selenide.Selenide.$;

public class UserSummaryGridLineCounter {
    int lineCounter;

    public UserSummaryGridLineCounter() {
        this.lineCounter = $("table")
                .findAll(".v-grid-row").size();
    }

    public int countLines() {
        return lineCounter;
    }
}
