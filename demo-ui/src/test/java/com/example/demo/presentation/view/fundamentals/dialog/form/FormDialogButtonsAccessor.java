package com.example.demo.presentation.view.fundamentals.dialog.form;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FormDialogButtonsAccessor {

    public static SelenideElement saveButton() {
        return $(By.id(SaveButton.ID));
    }

    public static SelenideElement cancelButton() {
        return $(By.id(CancelButton.ID));
    }

    private FormDialogButtonsAccessor() {
    }
}
