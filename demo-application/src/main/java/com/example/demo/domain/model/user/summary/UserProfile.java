package com.example.demo.domain.model.user.summary;

import com.example.demo.domain.model.user.EmailAddress;
import com.example.demo.domain.model.user.UserId;
import com.example.demo.domain.model.user.UserName;

public class UserProfile {
    UserId userId;
    UserName name;
    EmailAddress emailAddress;

    public UserProfile(UserId userId, UserName name, EmailAddress emailAddress) {
        this.userId = userId;
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public UserId userId() {
        return userId;
    }

    public UserName userName() {
        return name;
    }

    public EmailAddress emailAddress() {
        return emailAddress;
    }
}
