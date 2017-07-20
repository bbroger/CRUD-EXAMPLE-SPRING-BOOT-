/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.robson.controller;

import com.robson.entity.User;
import com.robson.service.UserServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author sltnote-6354
 */
@Controller
@RequestMapping("/sistema")
public class UserController {
    
    @Autowired
    UserServiceImpl userService;
    
    @GetMapping("/cadastro")
    public ModelAndView telaRegistro(User user){
        ModelAndView model = new ModelAndView("/index");
        model.addObject("user",user);
        
        return model;
    }
    
    @PostMapping("/cadatro")
    public String salvaUser(User user){
        userService.cadastrarUsuario(user);
        return ("redirect:/sys/cadatro");
    }
    
    @GetMapping("/lista")
    public ModelAndView listaPage(){
        ModelAndView model = new ModelAndView("/lista");
        List<User> list =  userService.getAllUsers();
        
        model.addObject("list",list);
        
        return model;
    }
    
}
