package com.example.demo.presentation.scenario.useradmin;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.example.demo.TestApplication;
import com.tngtech.jgiven.integration.spring.SimpleSpringRuleScenarioTest;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT, classes = TestApplication.class)
@ActiveProfiles("test")
public class UserRegisterScenario extends SimpleSpringRuleScenarioTest<UserRegisterStages> {
    @LocalServerPort
    private int port;

    @BeforeClass
    public static void setUp() {
        Configuration.browser = WebDriverRunner.CHROME;
    }

    @Test
    public void ユーザを登録できる() {
        given()
                .UserAdminViewへアクセス(port);

        when()
                .Addボタンをクリック();
        then()
                .UserRegisterDialogが起動する();

        when()
                .項目を入力する("tk", "bububu10", "tk@bububu10.com")
                .Saveボタンをクリック();
        then()
                .UserRegisterDialogが閉じる()
                .UserSummaryGridに登録レコードが1件追加される();
    }
}
