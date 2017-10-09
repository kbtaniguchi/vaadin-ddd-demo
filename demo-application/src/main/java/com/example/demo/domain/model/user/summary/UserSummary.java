package com.example.demo.domain.model.user.summary;

import com.example.demo.domain.model.fudamentals.audit.Audit;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class UserSummary {
    UserProfile profile;
    Audit audit;
    UserStatus status;

    public UserProfile profile() {
        return profile;
    }

    public Audit audit() {
        return audit;
    }

    public String statusAsText() {
        if (status == UserStatus.DELETED) return "Deleted";
        return "Active";
    }

    public boolean isDeleted() {
        return status == UserStatus.DELETED;
    }
}
