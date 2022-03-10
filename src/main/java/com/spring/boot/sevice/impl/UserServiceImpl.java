package com.spring.boot.sevice.impl;

import com.spring.boot.model.User;
import com.spring.boot.repository.UserRepository;
import com.spring.boot.sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User insertUser(User user) {
        return this.userRepository.save(user);
    }
}

