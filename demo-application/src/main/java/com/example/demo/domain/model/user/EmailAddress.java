package com.example.demo.domain.model.user;

public class EmailAddress {
    String value;

    public EmailAddress(String value) {
        this.value = value;
    }

    public String asText() {
        return value;
    }
}
