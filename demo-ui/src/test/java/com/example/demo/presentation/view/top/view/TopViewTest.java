package com.example.demo.presentation.view.top.view;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.example.demo.IntegrationTestApplication;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static com.codeborne.selenide.Selenide.open;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = IntegrationTestApplication.class)
@ActiveProfiles("test")
public class TopViewTest {
    @LocalServerPort
    private int port;

    @BeforeClass
    public static void setUp() {
        Configuration.browser = WebDriverRunner.CHROME;
        System.setProperty("webdriver.chrome.driver", "src/test/driver/chromedriver");
    }

    @Test
    public void test() {
        open("http://localhost:" + port);
    }
}