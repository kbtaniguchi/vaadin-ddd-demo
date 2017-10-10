package com.example.demo.infrastructure.datasource.user;

import com.example.demo.domain.model.user.UserRegister;
import com.example.demo.domain.model.user.profile.UserId;
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
    public void register(UserRegister userRegister) {
        mapper.storeNewUser(userRegister);
        storeTransaction(userRegister);
    }

    @Override
    public void revise(UserRegister userRegister) {
        mapper.deleteLastTransaction(userRegister);
        storeTransaction(userRegister);
    }

    private void storeTransaction(UserRegister userRegister) {
        long transactionId = mapper.nextTransactionId();
        mapper.storeTransaction(userRegister, transactionId);
        mapper.storeLastTransaction(userRegister, transactionId);
        mapper.storeProfile(userRegister, transactionId);
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
