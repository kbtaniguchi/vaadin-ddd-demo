package com.example.demo;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntegrationTestApplication {
    public static void main(final String[] args) {
        SpringApplication.run(IntegrationTestApplication.class, args);
        Configuration.browser = WebDriverRunner.CHROME;
        System.setProperty("webdriver.chrome.driver", "src/test/driver/chromedriver");
    }
}
