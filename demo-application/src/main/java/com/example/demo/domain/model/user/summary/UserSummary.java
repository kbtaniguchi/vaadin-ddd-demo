package com.example.demo.domain.model.user.summary;

import com.example.demo.domain.model.user.EmailAddress;
import com.example.demo.domain.model.user.UserName;

public class UserSummary {
    UserName name;
    EmailAddress emailAddress;

    public UserSummary(UserName name, EmailAddress emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public UserName userName() {
        return name;
    }

    public EmailAddress emailAddress() {
        return emailAddress;
    }
}
