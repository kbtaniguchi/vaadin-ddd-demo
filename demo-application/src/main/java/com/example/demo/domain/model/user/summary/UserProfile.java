package com.example.demo.domain.model.user.summary;

import com.example.demo.domain.model.user.EmailAddress;
import com.example.demo.domain.model.user.UserId;
import com.example.demo.domain.model.user.UserName;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class UserProfile {
    UserId userId;
    UserName name;
    EmailAddress emailAddress;

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
        if (userId.containsWithIgnoreCase(text)) return true;
        if (name.containsWithIgnoreCase(text)) return true;
        if (emailAddress.containsWithIgnoreCase(text)) return true;
        return false;
    }
}
