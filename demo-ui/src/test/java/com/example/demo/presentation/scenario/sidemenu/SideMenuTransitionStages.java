package com.example.demo.presentation.scenario.sidemenu;

import com.example.demo.presentation.ui.application.ApplicationUIPage;
import com.example.demo.presentation.view.top.view.TopView;
import com.example.demo.presentation.view.useradmin.root.view.UserAdminView;
import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.integration.spring.JGivenStage;

import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@JGivenStage
class SideMenuTransitionStages extends Stage<SideMenuTransitionStages> {
    ApplicationUIPage applicationUIPage;

    SideMenuTransitionStages ルートにアクセス(int port) {
        open(String.format("http://localhost:%s", port));
        sleep(1000);
        this.applicationUIPage = new ApplicationUIPage();
        return self();
    }

    SideMenuTransitionStages toUserAdminViewButtonをクリック() {
        applicationUIPage.toUserAdminViewButton().click();
        return self();
    }

    SideMenuTransitionStages UserAdminViewへ遷移できる() {
        sleep(1000);
        assertThat(title(), is(UserAdminView.CAPTION));
        return self();
    }

    SideMenuTransitionStages toTopViewButtonをクリック() {
        applicationUIPage.toTopViewButton().click();
        return self();
    }

    SideMenuTransitionStages TopViewへ遷移できる() {
        sleep(1000);
        assertThat(title(), is(TopView.CAPTION));
        return self();
    }
}
