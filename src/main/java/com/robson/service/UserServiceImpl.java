/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robson.service;

import com.robson.entity.User;
import com.robson.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sltnote-6354
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    
    
    @Override
    public User cadastrarUsuario(User user) {
        
        return this.userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        Iterable<User> itr = userRepository.findAll();
        return(List<User>)itr;
    }
    
}
