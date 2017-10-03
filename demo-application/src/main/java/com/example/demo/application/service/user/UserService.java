package com.example.demo.application.service.user;

import com.example.demo.domain.model.user.User;
import com.example.demo.domain.model.user.UserId;
import com.example.demo.domain.model.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void register(User user) {
        userRepository.register(user);
    }

    public void delete(UserId userId) {
        userRepository.delete(userId);
    }
}
