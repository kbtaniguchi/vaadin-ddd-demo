package com.example.demo.infrastructure.datasource.user.summary;

import com.example.demo.domain.model.user.summary.UserSummaries;
import com.example.demo.domain.model.user.summary.UserSummary;
import com.example.demo.domain.model.user.summary.UserSummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
public class UserSummaryDataSource implements UserSummaryRepository {

    public UserSummaries findAll() {
        Optional<List<UserSummary>> summaries = Optional.ofNullable(mapper.findLatestAll());
        return new UserSummaries(summaries.orElse(Collections.emptyList()));
    }

    UserSummaryMapper mapper;

    @Autowired
    public UserSummaryDataSource(UserSummaryMapper mapper) {
        this.mapper = mapper;
    }
}
