package com.example.demo.infrastructure.datasource.user;

import com.example.demo.domain.model.fudamentals.audit.Version;
import com.example.demo.domain.model.user.UserRegister;
import com.example.demo.domain.model.user.UserRepository;
import com.example.demo.domain.model.user.profile.UserId;
import com.example.demo.domain.model.user.profile.UserProfile;
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
        mapper.storeNewUser(userRegister.profile().userId());
        storeNewUserTransaction(userRegister.profile());
    }

    private void storeNewUserTransaction(UserProfile profile) {
        long transactionId = mapper.nextTransactionId();
        mapper.storeTransaction(profile.userId(), transactionId);
        mapper.storeProfile(profile, transactionId);
        mapper.storeLastTransaction(profile.userId(), transactionId, Version.first());
    }


    @Override
    public void revise(UserRegister userRegister) {
        storeTransaction(userRegister.profile());
    }

    private void storeTransaction(UserProfile profile) {
        long transactionId = mapper.nextTransactionId();
        mapper.storeTransaction(profile.userId(), transactionId);
        mapper.storeProfile(profile, transactionId);

        Version nextVersion = mapper.nextVersion(profile.userId());
        mapper.deleteLastTransaction(profile.userId());
        mapper.storeLastTransaction(profile.userId(), transactionId, nextVersion);
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
