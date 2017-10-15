package com.example.demo.presentation.scenario.useradmin;

import com.example.demo.TestApplication;
import com.example.demo.presentation.scenario.ScenarioTestUtils;
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
        ScenarioTestUtils.setUpProperties();
    }

    @Test
    public void ユーザを登録できる() {
        given().UserAdminViewへアクセス(port)
                .and()
                .Addボタンをクリック()
                .and()
                .UserRegisterDialogが起動する();
        when().全項目を入力する("tk", "bububu10", "tk@bububu10.com")
                .and()
                .Saveボタンをクリック();
        then().UserRegisterDialogが閉じる()
                .and()
                .UserSummaryGridに登録レコードが1件追加される();
    }

    @Test
    public void ユーザ登録を途中でキャンセルできる() {
        given().UserAdminViewへアクセス(port)
                .and()
                .Addボタンをクリック()
                .and()
                .UserRegisterDialogが起動する();
        when().全項目を入力する("tk1", "bububu100", "tk1@bububu10.com")
                .and()
                .Cancelボタンをクリック();
        then().UserRegisterDialogが閉じる()
                .and()
                .UserSummaryGridにレコードが追加されていない();
    }

    @Test
    public void 入力値の不正があった場合はエラーメッセージを表示する() {
        given().UserAdminViewへアクセス(port)
                .and()
                .Addボタンをクリック()
                .and()
                .UserRegisterDialogが起動する();
        when().全項目に空文字を入力()
                .and()
                .Saveボタンをクリック();
        then().UserRegisterDialogが開いたまま()
                .and()
                .エラーメッセージが表示される();
    }
}
