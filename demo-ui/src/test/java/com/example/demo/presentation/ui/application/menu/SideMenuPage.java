package com.example.demo.presentation.ui.application.menu;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SideMenuPage {

    public SelenideElement toTopViewButton() {
        return $(By.id(ToTopViewButton.ID));
    }

    public SelenideElement toUserAdminViewButton() {
        return $(By.id(ToUserAdminViewButton.ID));
    }
}
