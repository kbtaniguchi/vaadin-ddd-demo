package com.example.demo.infrastructure.datasource.user.summary;

import com.example.demo.domain.model.user.summary.UserSummaries;
import com.example.demo.domain.model.user.summary.UserSummary;
import com.example.demo.domain.model.user.summary.UserSummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class UserSummaryDataSource implements UserSummaryRepository {

    public UserSummaries findAll() {
        List<UserSummary> summaries = mapper.findLatestAll();
        if (summaries == null) return new UserSummaries(Collections.emptyList());
        return new UserSummaries(summaries);
    }

    UserSummaryMapper mapper;

    @Autowired
    public UserSummaryDataSource(UserSummaryMapper mapper) {
        this.mapper = mapper;
    }
}
