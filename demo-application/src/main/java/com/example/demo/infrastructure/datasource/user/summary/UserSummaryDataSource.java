package com.example.demo.infrastructure.datasource.user.summary;

import com.example.demo.domain.model.user.EmailAddress;
import com.example.demo.domain.model.user.UserName;
import com.example.demo.domain.model.user.summary.UserSummaries;
import com.example.demo.domain.model.user.summary.UserSummary;
import com.example.demo.domain.model.user.summary.UserSummaryRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserSummaryDataSource implements UserSummaryRepository {
    // TODO now dummy data. to use database.
    public UserSummaries findAll() {
        List<UserSummary> userSummaries = Arrays.asList(
                new UserSummary(new UserName("test_user_name1"), new EmailAddress("test1@sample.com")),
                new UserSummary(new UserName("test_user_name2"), new EmailAddress("test2@sample.com")),
                new UserSummary(new UserName("test_user_name3"), new EmailAddress("test3@sample.com")));
        return new UserSummaries(userSummaries);
    }
}
