package com.example.demo.domain.model.user.profile;

import lombok.NoArgsConstructor;

@NoArgsConstructor
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

    public boolean containsWithIgnoreCase(String text) {
        return userId.containsWithIgnoreCase(text) ||
                name.containsWithIgnoreCase(text) ||
                emailAddress.containsWithIgnoreCase(text);
    }
}
