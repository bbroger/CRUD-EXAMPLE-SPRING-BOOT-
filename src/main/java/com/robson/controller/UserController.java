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
import org.springframework.web.bind.annotation.PathVariable;
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
    
    @GetMapping("/menu")
    public String menu(){
        
        return "/menu";
    }
    
    
    @GetMapping("/cadastro")
    public ModelAndView telaRegistro(User user){
        ModelAndView model = new ModelAndView("/index");
        model.addObject("user",user);
        
        return model;
    }
    
    @PostMapping("/cadastro")
    public String salvaUser(User user){
        userService.cadastrarUsuario(user);
        return ("redirect:/sistema/cadastro");
    }
    
    @GetMapping("/lista")
    public ModelAndView listaPage(){
        ModelAndView model = new ModelAndView("/exbUser");
        List<User> list =  userService.getAllUsers();
        
        model.addObject("list",list);
        
        return model;
    }
    
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id){
        userService.deletarUsuario(id);
        return ("redirect:/sistema/lista");
    }
    
    @GetMapping("/edit/{id}")
    public ModelAndView editarUser(@PathVariable int id, User user){
       ModelAndView model = new ModelAndView("/editUser");
       
       user = userService.findById(id);
       
       model.addObject("user",user);
       
       return model;
    }
    
}
