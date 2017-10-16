package com.example.demo.presentation.scenario.sidemenu;

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
public class SideMenuTransitionScenario extends SimpleSpringRuleScenarioTest<SideMenuTransitionStages> {
    @LocalServerPort
    private int port;

    @BeforeClass
    public static void setUp() {
        ScenarioTestUtils.setUpProperties();
    }

    @Test
    public void A1_サイドメニューからUserAdminに遷移できる() {
        given().ルートにアクセス(port);
        when().toUserAdminViewButtonをクリック();
        then().UserAdminへ遷移する();
    }

    @Test
    public void A2_サイドメニューからTopに遷移できる() {
        given().ルートにアクセス(port)
                .and()
                .toUserAdminViewButtonをクリック()
                .and()
                .UserAdminへ遷移する();
        when().toTopViewButtonをクリック();
        then().Topへ遷移する();
    }
}
