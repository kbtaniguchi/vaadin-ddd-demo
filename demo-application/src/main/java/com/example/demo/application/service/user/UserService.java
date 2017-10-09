package com.example.demo.application.service.user;

import com.example.demo.domain.model.user.User;
import com.example.demo.domain.model.user.UserId;
import com.example.demo.domain.model.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public boolean alreadyUsed(UserId userId) {
        return userRepository.exists(userId);
    }

    public void register(User user) {
        userRepository.register(user);
    }

    public void revise(User user) {
        userRepository.revise(user);
    }

    public void delete(UserId userId) {
        userRepository.delete(userId);
    }

    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
