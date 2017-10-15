package com.example.demo.presentation.scenario.useradmin;

import com.codeborne.selenide.Condition;
import com.example.demo.presentation.view.useradmin.dialog.register.UserRegisterDialogPage;
import com.example.demo.presentation.view.useradmin.root.view.UserAdminView;
import com.example.demo.presentation.view.useradmin.root.view.UserAdminViewPage;
import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.As;
import com.tngtech.jgiven.integration.spring.JGivenStage;

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

    @As("項目を入力する [id:{$}, name:{$}, email:{$}]")
    UserRegisterStages 項目を入力する(String id, String name, String email) {
        userRegisterDialogPage.id().val(id);
        userRegisterDialogPage.name().val(name);
        userRegisterDialogPage.email().val(email);
        return self();
    }

    UserRegisterStages Saveボタンをクリック() {
        userRegisterDialogPage.SaveButton().click();
        return self();
    }

    UserRegisterStages UserRegisterDialogが閉じる() {
        userRegisterDialogPage.own().should(Condition.disappear);
        return self();
    }

    UserRegisterStages UserSummaryGridに登録レコードが1件追加される() {
        sleep(1000);
        this.afterUserAdminViewPage = new UserAdminViewPage();

        int beforeCount = beforeUserAdminViewPage.countGridData();
        int afterCount = afterUserAdminViewPage.countGridData();
        assertThat(afterCount - beforeCount, is(1));
        return self();
    }
}
