package com.example.demo.application.service.user.summary;

import com.example.demo.domain.model.user.summary.UserSummaries;
import com.example.demo.domain.model.user.summary.UserSummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSummaryService {
    @Autowired
    UserSummaryRepository userSummaryRepository;

    UserSummaries allUserSummaries() {
        return userSummaryRepository.findAll();
    }
}
