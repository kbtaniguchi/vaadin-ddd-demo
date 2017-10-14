package com.example.demo.presentation.ui.application;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.example.demo.presentation.view.top.view.TopView;
import com.example.demo.presentation.view.useradmin.root.view.UserAdminView;

import static com.codeborne.selenide.Selenide.$$;

public class ApplicationUIPage {

    public SelenideElement toTopViewButton() {
        return $$(".valo-menu-item-caption")
                .find(Condition.text(TopView.CAPTION));
    }

    public SelenideElement toUserAdminViewButton() {
        return $$(".valo-menu-item-caption")
                .find(Condition.text(UserAdminView.CAPTION));
    }
}
