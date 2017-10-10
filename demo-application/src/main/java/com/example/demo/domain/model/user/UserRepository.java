package com.example.demo.domain.model.user;

import com.example.demo.domain.model.user.profile.UserId;

public interface UserRepository {

    boolean exists(UserId userId);

    void register(UserRegister userRegister);

    void revise(UserRegister userRegister);

    void delete(UserId userId);

}
