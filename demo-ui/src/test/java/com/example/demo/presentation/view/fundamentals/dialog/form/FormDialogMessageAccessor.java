package com.example.demo.presentation.view.fundamentals.dialog.form;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FormDialogMessageAccessor {

    public static SelenideElement errorMessage() {
        return $(By.id(ErrorDisplay.ID));
    }

    private FormDialogMessageAccessor() {
    }
}
