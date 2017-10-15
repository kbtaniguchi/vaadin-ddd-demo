package com.example.demo.presentation.scenario.sidemenu;

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
public class SideMenuTransitionScenario extends SimpleSpringRuleScenarioTest<SideMenuTransitionStages> {
    @LocalServerPort
    private int port;

    @BeforeClass
    public static void setUp() {
        ScenarioTestUtils.setUpProperties();
    }

    @Test
    public void サイドメニューから各Viewに遷移できる() {
        given()
                .ルートにアクセス(port);

        when()
                .toUserAdminViewButtonをクリック();
        then()
                .UserAdminViewへ遷移できる();

        when()
                .toTopViewButtonをクリック();
        then()
                .TopViewへ遷移できる();
    }
}
