package com.example.demo.domain.model.user.summary;

import com.example.demo.domain.model.fudamentals.audit.Audit;

public class UserSummary {
    UserProfile profile;
    Audit audit;

    public UserSummary(UserProfile profile, Audit audit) {
        this.profile = profile;
        this.audit = audit;
    }

    public UserProfile profile() {
        return profile;
    }

    public Audit audit() {
        return audit;
    }
}
