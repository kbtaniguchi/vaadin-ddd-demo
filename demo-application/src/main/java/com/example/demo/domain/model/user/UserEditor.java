package com.example.demo.domain.model.user;

import com.example.demo.domain.model.fudamentals.audit.Version;
import com.example.demo.domain.model.user.profile.UserProfile;

public class UserEditor {
    UserProfile profile;
    Version originalVersion;

    public UserEditor(UserProfile profile, Version originalVersion) {
        this.profile = profile;
        this.originalVersion = originalVersion;
    }

    public UserProfile profile() {
        return profile;
    }

    public boolean isStalerThan(Version latestVersion) {
        return !originalVersion.same(latestVersion);
    }
}
