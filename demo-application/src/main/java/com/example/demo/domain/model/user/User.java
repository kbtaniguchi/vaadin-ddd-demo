package com.example.demo.domain.model.user;

public class User {
    UserId userId;
    UserName name;
    EmailAddress emailAddress;

    public User(UserId userId, UserName name, EmailAddress emailAddress) {
        this.userId = userId;
        this.name = name;
        this.emailAddress = emailAddress;
    }
}
