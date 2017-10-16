package com.example.demo.presentation.scenario.useradmin;

import com.example.demo.presentation.view.useradmin.dialog.register.view.UserRegisterDialogPage;
import com.example.demo.presentation.view.useradmin.root.view.UserAdminView;
import com.example.demo.presentation.view.useradmin.root.view.UserAdminViewPage;
import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.As;
import com.tngtech.jgiven.integration.spring.JGivenStage;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@JGivenStage
class UserRegisterStages extends Stage<UserRegisterStages> {

    UserAdminViewPage beforeUserAdminViewPage;
    UserRegisterDialogPage userRegisterDialogPage;
    UserAdminViewPage afterUserAdminViewPage;

    @As("UserAdminViewへアクセス [port:{$}]")
    UserRegisterStages UserAdminViewへアクセス(int port) {
        open(String.format("http://localhost:%s/#!%s", port, UserAdminView.VIEW_NAME));
        sleep(1000);
        this.beforeUserAdminViewPage = new UserAdminViewPage();
        return self();
    }

    UserRegisterStages Addボタンをクリック() {
        beforeUserAdminViewPage.addButton().click();
        return self();
    }

    UserRegisterStages UserRegisterDialogが起動する() {
        sleep(1000);
        this.userRegisterDialogPage = new UserRegisterDialogPage();
        return self();
    }

    @As("全項目を入力する [userId:{$}, userName:{$}, email:{$}]")
    UserRegisterStages 全項目を入力する(String id, String name, String email) {
        userRegisterDialogPage.userId().val(id);
        userRegisterDialogPage.userName().val(name);
        userRegisterDialogPage.email().val(email);
        return self();
    }

    UserRegisterStages 全項目に空文字を入力() {
        userRegisterDialogPage.userId().val("");
        userRegisterDialogPage.userName().val("");
        userRegisterDialogPage.email().val("");
        return self();
    }

    UserRegisterStages Saveボタンをクリック() {
        userRegisterDialogPage.saveButton().click();
        return self();
    }

    UserRegisterStages Cancelボタンをクリック() {
        userRegisterDialogPage.cancelButton().click();
        return self();
    }

    UserRegisterStages UserRegisterDialogが開いたまま() {
        userRegisterDialogPage.own().should(exist);
        return self();
    }

    UserRegisterStages エラーメッセージが表示される() {
        sleep(1000);
        userRegisterDialogPage.errorMessage().should(appear);
        return self();
    }

    UserRegisterStages UserSummaryGridに登録レコードが1件追加される() {
        sleep(1000);
        this.afterUserAdminViewPage = new UserAdminViewPage();

        int beforeCount = beforeUserAdminViewPage.countUserSummaryGridLines();
        int afterCount = afterUserAdminViewPage.countUserSummaryGridLines();
        assertThat(afterCount - beforeCount, is(1));
        return self();
    }

    UserRegisterStages UserSummaryGridにレコードが追加されていない() {
        sleep(1000);
        this.afterUserAdminViewPage = new UserAdminViewPage();

        int beforeCount = beforeUserAdminViewPage.countUserSummaryGridLines();
        int afterCount = afterUserAdminViewPage.countUserSummaryGridLines();
        assertThat(afterCount - beforeCount, is(0));
        return self();
    }
}
