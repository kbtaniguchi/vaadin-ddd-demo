package com.example.demo.presentation.scenario.sidemenu;

import com.example.demo.presentation.ui.application.menu.SideMenuAccessor;
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
    SideMenuAccessor sideMenuAccessor;

    @As("ルートへアクセス [port:{$}]")
    SideMenuTransitionStages ルートにアクセス(int port) {
        open(String.format("http://localhost:%s", port));
        sleep(1000);
        this.sideMenuAccessor = new SideMenuAccessor();
        return self();
    }

    SideMenuTransitionStages toUserAdminViewButtonをクリック() {
        sideMenuAccessor.toUserAdminViewButton().click();
        return self();
    }

    SideMenuTransitionStages UserAdminへ遷移する() {
        sleep(1000);
        assertThat(title(), is(UserAdminView.TITLE));
        return self();
    }

    SideMenuTransitionStages toTopViewButtonをクリック() {
        sideMenuAccessor.toTopViewButton().click();
        return self();
    }

    SideMenuTransitionStages Topへ遷移する() {
        sleep(1000);
        assertThat(title(), is(TopView.TITLE));
        return self();
    }
}
