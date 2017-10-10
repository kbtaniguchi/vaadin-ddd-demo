package com.example.demo.application.service.user;

import com.example.demo.domain.model.user.UserRegister;
import com.example.demo.domain.model.user.profile.UserId;
import com.example.demo.domain.model.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public boolean alreadyUsed(UserId userId) {
        return userRepository.exists(userId);
    }

    public void register(UserRegister userRegister) {
        userRepository.register(userRegister);
    }

    public void revise(UserRegister userRegister) {
        userRepository.revise(userRegister);
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
