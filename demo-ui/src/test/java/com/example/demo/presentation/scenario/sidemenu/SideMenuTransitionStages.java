package com.example.demo.presentation.scenario.sidemenu;

import com.example.demo.presentation.ui.application.menu.SideMenuPage;
import com.example.demo.presentation.view.top.view.TopView;
import com.example.demo.presentation.view.useradmin.root.view.UserAdminView;
import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.As;
import com.tngtech.jgiven.integration.spring.JGivenStage;

import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@JGivenStage
class SideMenuTransitionStages extends Stage<SideMenuTransitionStages> {
    SideMenuPage sideMenuPage;

    @As("ルートへアクセス [port:{$}]")
    SideMenuTransitionStages ルートにアクセス(int port) {
        open(String.format("http://localhost:%s", port));
        sleep(1000);
        this.sideMenuPage = new SideMenuPage();
        return self();
    }

    SideMenuTransitionStages toUserAdminViewButtonをクリック() {
        sideMenuPage.toUserAdminViewButton().click();
        return self();
    }

    SideMenuTransitionStages UserAdminViewへ遷移できる() {
        sleep(1000);
        assertThat(title(), is(UserAdminView.CAPTION));
        return self();
    }

    SideMenuTransitionStages toTopViewButtonをクリック() {
        sideMenuPage.toTopViewButton().click();
        return self();
    }

    SideMenuTransitionStages TopViewへ遷移できる() {
        sleep(1000);
        assertThat(title(), is(TopView.CAPTION));
        return self();
    }
}
