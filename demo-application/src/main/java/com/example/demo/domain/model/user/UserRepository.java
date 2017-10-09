package com.example.demo.domain.model.user;

public interface UserRepository {

    boolean exists(UserId userId);

    void register(User user);

    void delete(UserId userId);
}
