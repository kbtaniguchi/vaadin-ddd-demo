package com.example.demo.domain.model.user;

public interface UserRepository {

    void register(User user);

    void delete(UserId userId);
}
