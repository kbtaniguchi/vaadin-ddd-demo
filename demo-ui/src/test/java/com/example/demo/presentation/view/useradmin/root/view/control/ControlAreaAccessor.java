package com.example.demo.presentation.view.useradmin.root.view.control;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ControlAreaAccessor {

    public static SelenideElement searchText() {
        return $(By.id(SearchTextField.ID));
    }

    public static SelenideElement searchButton() {
        return $(By.id(SearchButton.ID));
    }

    public static SelenideElement addButton() {
        return $(By.id(AddButton.ID));
    }

    public static SelenideElement editButton() {
        return $(By.id(EditButton.ID));
    }

    public static SelenideElement deleteButton() {
        return $(By.id(DeleteButton.ID));
    }

    private ControlAreaAccessor() {
    }
}
