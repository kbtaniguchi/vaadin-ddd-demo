package com.example.demo.presentation.scenario.useradmin;

import com.example.demo.TestApplication;
import com.example.demo.presentation.scenario.ScenarioTestUtils;
import com.tngtech.jgiven.integration.spring.SimpleSpringRuleScenarioTest;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT, classes = TestApplication.class)
@ActiveProfiles("test")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserRegisterScenario extends SimpleSpringRuleScenarioTest<UserRegisterStages> {
    @LocalServerPort
    private int port;

    @BeforeClass
    public static void setUp() {
        ScenarioTestUtils.setUpProperties();
    }

    @Test
    public void A1_ユーザを登録できる() {
        given().UserAdminViewへアクセス(port)
                .and()
                .Addボタンをクリック()
                .and()
                .UserRegisterDialogが起動する();
        when().全項目を入力する("tk", "bububu10", "tk@bububu10.com")
                .and()
                .Saveボタンをクリック();
        then().UserSummaryGridに登録レコードが1件追加される();
    }

    @Test
    public void A2_ユーザの登録を途中でキャンセルできる() {
        given().UserAdminViewへアクセス(port)
                .and()
                .Addボタンをクリック()
                .and()
                .UserRegisterDialogが起動する();
        when().全項目を入力する("tk1", "bububu100", "tk1@bububu10.com")
                .and()
                .Cancelボタンをクリック();
        then().UserSummaryGridにレコードが追加されていない();
    }

    @Test
    public void A3_入力値の不正があった場合はエラーメッセージを表示する() {
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
