package com.example.demo.presentation.scenario;

import com.codeborne.selenide.WebDriverRunner;
import com.tngtech.jgiven.report.ReportGenerator;

import java.util.Properties;

public class ScenarioTestUtils {
    static final String TARGET_BROWSER = WebDriverRunner.CHROME;
    static final String JSON_REPORT_DIR = "build/jgiven-reports/json";
    static final String HTML_REPORT_DIR = "build/jgiven-reports/html";

    public static void setUpProperties() {
        Properties properties = System.getProperties();
        properties.setProperty("selenide.browser", TARGET_BROWSER);
        properties.setProperty("jgiven.report.dir", JSON_REPORT_DIR);
    }

    public static void generateHtmlReports() {
        try {
            ReportGenerator.main(
                    "--format=html",
                    String.format("--sourceDir=demo-ui/%s", JSON_REPORT_DIR),
                    String.format("--targetDir=demo-ui/%s", HTML_REPORT_DIR));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private ScenarioTestUtils() {
    }
}
