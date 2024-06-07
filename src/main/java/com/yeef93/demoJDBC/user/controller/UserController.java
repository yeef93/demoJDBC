package com.yeef93.demoJDBC.user.controller;


import com.yeef93.demoJDBC.user.entity.User;
import com.yeef93.demoJDBC.user.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    private final  UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }

    @PostMapping
    public void createUser(@RequestBody User user){
        userService.createUser(user);
    }
}
