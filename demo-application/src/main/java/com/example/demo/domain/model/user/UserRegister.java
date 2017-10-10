package com.example.demo.domain.model.user;

import com.example.demo.domain.model.user.profile.EmailAddress;
import com.example.demo.domain.model.user.profile.UserId;
import com.example.demo.domain.model.user.profile.UserName;

public class UserRegister {
    UserId id;
    UserName name;
    EmailAddress emailAddress;

    public UserRegister(UserId id, UserName name, EmailAddress emailAddress) {
        this.id = id;
        this.name = name;
        this.emailAddress = emailAddress;
    }
}
