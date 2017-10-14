package com.example.demo.presentation.view.useradmin.dialog.register;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class UserRegisterDialogPage {

    public UserRegisterDialogPage() {
        String dialogTitle = $(".v-window-header").getText();
        if (!dialogTitle.equals("User Register Dialog")) throw new IllegalStateException();
    }

    public SelenideElement own() {
        return $(".popupContent");
    }

    public SelenideElement id() {
        return $$("input").filter(Condition.cssClass("v-textfield-required")).get(0);
    }

    public SelenideElement name() {
        return $$("input").filter(Condition.cssClass("v-textfield-required")).get(1);
    }

    public SelenideElement email() {
        return $$("input").filter(Condition.cssClass("v-textfield-required")).get(2);
    }


    public SelenideElement SaveButton() {
        return $$(".v-button")
                .find(Condition.text("Save"));
    }

    public SelenideElement cancelButton() {
        return $$(".v-button")
                .find(Condition.text("Cancel"));
    }
}
