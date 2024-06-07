package com.yeef93.demoJDBC.user.service;


import com.yeef93.demoJDBC.user.entity.User;
import com.yeef93.demoJDBC.user.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService  {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll(){
        return  userRepository.findAll();
    }

    @Override
    @Transactional
    public void createUser(User user){
        userRepository.save(user);
        throw new RuntimeException("Error");
    }

}
