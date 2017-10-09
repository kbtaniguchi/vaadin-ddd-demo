package com.example.demo.infrastructure.datasource.user;

import com.example.demo.domain.model.user.User;
import com.example.demo.domain.model.user.UserId;
import com.example.demo.domain.model.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDataSource implements UserRepository {

    @Override
    public boolean exists(UserId userId) {
        return mapper.exists(userId);
    }

    @Override
    public void register(User user) {
        mapper.storeNewUser(user);
        storeTransaction(user);
    }

    private void storeTransaction(User user) {
        long transactionId = mapper.nextTransactionId();
        mapper.storeTransaction(user, transactionId);
        mapper.storeLastTransaction(user, transactionId);
        mapper.storeProfile(user, transactionId);
    }

    @Override
    public void delete(UserId userId) {
        mapper.storeDeleteUserId(userId);
    }

    UserMapper mapper;

    @Autowired
    public UserDataSource(UserMapper mapper) {
        this.mapper = mapper;
    }
}
