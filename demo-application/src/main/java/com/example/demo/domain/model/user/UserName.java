package com.example.demo.domain.model.user;

public class UserName {
    String value;

    public UserName(String value) {
        this.value = value;
    }

    public String asText() {
        return value;
    }
}
