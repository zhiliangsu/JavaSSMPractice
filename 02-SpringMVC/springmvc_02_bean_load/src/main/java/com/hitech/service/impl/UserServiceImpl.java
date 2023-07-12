package com.hitech.service.impl;

import com.hitech.domain.User;
import com.hitech.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void save(User user) {
        System.out.println("user service...");
    }
}
