package com.codeWithAjay.userRegistration.controller;

import com.codeWithAjay.userRegistration.model.User;
import com.codeWithAjay.userRegistration.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class userController {
    @Autowired
    private userService userservice;

    @GetMapping("/")
    public String register(Model model){
        User user =new User();
        model.addAttribute("user", user);
        return "register";
    }
    @PostMapping("/registerUser")
    public String registerUser(@ModelAttribute("user") User user){

        userservice.registerUser(user);
        return "home";
    }

}
