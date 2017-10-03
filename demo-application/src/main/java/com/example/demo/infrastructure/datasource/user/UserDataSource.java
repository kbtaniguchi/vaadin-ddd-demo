package com.example.demo.infrastructure.datasource.user;

import com.example.demo.domain.model.user.User;
import com.example.demo.domain.model.user.UserId;
import com.example.demo.domain.model.user.UserRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserDataSource implements UserRepository {
    // TODO use database
    @Override
    public void register(User user) {

    }

    @Override
    public void delete(UserId userId) {

    }

}
