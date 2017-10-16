package com.example.demo.presentation.view.useradmin.root.view;

import com.codeborne.selenide.SelenideElement;
import com.example.demo.presentation.view.useradmin.root.view.control.ControlAreaAccessor;
import com.example.demo.presentation.view.useradmin.root.view.grid.UserSummaryGridLineCounter;

import static com.codeborne.selenide.Selenide.title;

public class UserAdminViewPage {

    UserSummaryGridLineCounter userSummaryGridLineCounter;

    public UserAdminViewPage() {
        if (!title().equals(UserAdminView.TITLE)) throw new IllegalStateException();
        this.userSummaryGridLineCounter = new UserSummaryGridLineCounter();
    }

    public SelenideElement searchText() {
        return ControlAreaAccessor.searchText();
    }

    public SelenideElement searchButton() {
        return ControlAreaAccessor.searchButton();
    }

    public SelenideElement addButton() {
        return ControlAreaAccessor.addButton();
    }

    public SelenideElement editButton() {
        return ControlAreaAccessor.editButton();
    }

    public SelenideElement deleteButton() {
        return ControlAreaAccessor.deleteButton();
    }

    public int countUserSummaryGridLines() {
        return userSummaryGridLineCounter.countLines();
    }
}
