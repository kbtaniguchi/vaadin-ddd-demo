package com.example.demo.domain.model.user.summary;

import com.example.demo.domain.model.fudamentals.audit.Audit;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class UserSummary {
    UserProfile profile;
    Audit audit;

    public UserProfile profile() {
        return profile;
    }

    public Audit audit() {
        return audit;
    }
}
