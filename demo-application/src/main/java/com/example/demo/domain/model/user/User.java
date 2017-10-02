package com.example.demo.domain.model.user;

public class User {
    UserName name;
    EmailAddress emailAddress;

    public User(UserName name, EmailAddress emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }
}
