package com.spring.boot.sevice;

import com.spring.boot.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User insertUser(User user);

}
