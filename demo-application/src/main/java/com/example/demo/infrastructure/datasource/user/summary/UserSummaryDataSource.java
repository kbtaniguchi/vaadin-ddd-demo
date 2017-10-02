package com.example.demo.infrastructure.datasource.user.summary;

import com.example.demo.domain.model.user.EmailAddress;
import com.example.demo.domain.model.user.UserId;
import com.example.demo.domain.model.user.UserName;
import com.example.demo.domain.model.user.summary.*;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Repository
public class UserSummaryDataSource implements UserSummaryRepository {
    // TODO now dummy data. to use database.
    public UserSummaries findAll() {
        List<UserSummary> userSummaries = Arrays.asList(
                newUserSummary(1),
                newUserSummary(2),
                newUserSummary(3));
        return new UserSummaries(userSummaries);
    }

    private UserSummary newUserSummary(int number) {
        String numberStr = String.valueOf(number);
        return new UserSummary(
                new UserId("dummy_user_id_" + numberStr),
                new UserName("dummy_user_name_" + numberStr),
                new EmailAddress("dummy_" + numberStr + "@dummy.com"),
                new CreateDateTime(LocalDateTime.now()),
                new UpdateDateTime(LocalDateTime.now())
        );
    }
}
