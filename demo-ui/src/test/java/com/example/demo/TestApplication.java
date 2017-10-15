package com.example.demo;

import com.tngtech.jgiven.integration.spring.EnableJGiven;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableJGiven
public class TestApplication {
    public static void main(final String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
