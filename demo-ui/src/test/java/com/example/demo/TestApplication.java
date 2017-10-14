package com.example.demo;

import com.tngtech.jgiven.impl.Config;
import com.tngtech.jgiven.integration.spring.EnableJGiven;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.File;

@SpringBootApplication
@EnableJGiven
public class TestApplication {
    public static void main(final String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

    @Bean
    Config jGivenConfig() {
        Config config = Config.config();
        config.setReportDir(new File("build/jgiven-reports/json"));
        return config;
    }

}
