package com.example.demo.domain.model.user.summary;

import com.example.demo.domain.model.user.EmailAddress;
import com.example.demo.domain.model.user.UserId;
import com.example.demo.domain.model.user.UserName;

public class UserSummary {
    UserId userId;
    UserName name;
    EmailAddress emailAddress;
    CreateDateTime createDateTime;
    UpdateDateTime updateDateTime;

    public UserSummary(UserId userId, UserName name, EmailAddress emailAddress,
                       CreateDateTime createDateTime, UpdateDateTime updateDateTime) {
        this.userId = userId;
        this.name = name;
        this.emailAddress = emailAddress;
        this.createDateTime = createDateTime;
        this.updateDateTime = updateDateTime;
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

    public CreateDateTime createDateTime() {
        return createDateTime;
    }

    public UpdateDateTime updateDateTime() {
        return updateDateTime;
    }
}
