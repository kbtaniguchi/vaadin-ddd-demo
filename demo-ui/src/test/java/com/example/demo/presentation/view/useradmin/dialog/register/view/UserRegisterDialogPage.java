package com.example.demo.presentation.view.useradmin.dialog.register.view;

import com.codeborne.selenide.SelenideElement;
import com.example.demo.presentation.view.fundamentals.dialog.form.FormDialogButtonsAccessor;
import com.example.demo.presentation.view.fundamentals.dialog.form.FormDialogMessageAccessor;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UserRegisterDialogPage {

    public UserRegisterDialogPage() {
        if (!dialogTitle().equals(UserRegisterDialog.CAPTION))
            throw new IllegalStateException();
    }

    private String dialogTitle() {
        return $(".v-window-header").getText();
    }

    public SelenideElement own() {
        return $(By.id(UserRegisterDialog.ID));
    }

    public SelenideElement userId() {
        return $(By.id(UserIdInputField.ID));
    }

    public SelenideElement userName() {
        return $(By.id(UserNameInputField.ID));
    }

    public SelenideElement email() {
        return $(By.id(EmailAddressInputField.ID));
    }

    public SelenideElement errorMessage() {
        return FormDialogMessageAccessor.errorMessage();
    }

    public SelenideElement saveButton() {
        return FormDialogButtonsAccessor.saveButton();
    }

    public SelenideElement cancelButton() {
        return FormDialogButtonsAccessor.cancelButton();
    }
}
