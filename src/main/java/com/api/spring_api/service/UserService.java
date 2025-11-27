package com.api.spring_api.service;

import com.api.spring_api.domain.entities.user.User;
import com.api.spring_api.domain.requests.UserRequest;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserService {
    public User createUser(UserRequest data) {
        User user = new User();
        if(data.name() != null)
            user.setName(data.name());
        if(data.email() != null)
            user.setEmail(data.email());
        if(data.hash_password() != null)
            user.setHash_password(data.hash_password());
        if(data.active() != null)
            user.setActive(data.active());
        if(data.birth_date() != null)
            user.setBirth_date(new Date(data.birth_date()));
        return user;
    }
}
