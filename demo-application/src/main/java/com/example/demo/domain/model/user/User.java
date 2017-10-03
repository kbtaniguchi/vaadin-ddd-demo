package com.example.demo.domain.model.user;

public class User {
    UserId id;
    UserName name;
    EmailAddress emailAddress;

    public User(UserId id, UserName name, EmailAddress emailAddress) {
        this.id = id;
        this.name = name;
        this.emailAddress = emailAddress;
    }
}
