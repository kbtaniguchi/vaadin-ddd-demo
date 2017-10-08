package com.example.demo.domain.model.user.summary;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class UserSummaries {
    List<UserSummary> values;

    public UserSummaries(Set<UserSummary> values) {
        this.values = new ArrayList<>(values);
    }

    public UserSummaries(List<UserSummary> values) {
        this.values = values;
    }

    public boolean isEmpty() {
        return values.isEmpty();
    }

    public boolean isSingle() {
        return values.size() == 1;
    }

    public boolean isMultiple() {
        return values.size() > 1;
    }
}
