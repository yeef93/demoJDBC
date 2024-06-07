package com.yeef93.demoJDBC.user.service;

import com.yeef93.demoJDBC.user.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    void createUser(User user);
}
