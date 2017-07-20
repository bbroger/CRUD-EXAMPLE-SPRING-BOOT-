/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robson.service;

import com.robson.entity.User;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 *
 * @author sltnote-6354
 */
@Service("userService")
public interface UserService {
    
    public User cadastrarUsuario(User user);
    
    public List<User> getAllUsers();
    
    public void deletarUsuario(int id);
    
}
