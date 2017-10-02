package com.example.demo.domain.model.user;

public class UserId {
    String value;

    public UserId(String value) {
        this.value = value;
    }

    public String asText() {
        return value;
    }
}
