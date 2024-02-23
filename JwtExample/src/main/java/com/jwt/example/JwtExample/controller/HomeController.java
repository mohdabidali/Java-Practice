package com.jwt.example.JwtExample.controller;

import com.jwt.example.JwtExample.Model.User;
import com.jwt.example.JwtExample.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class HomeController {
    @Autowired
    private UserService userService;
    Logger logger = LoggerFactory.getLogger(HomeController.class);
    @GetMapping("/user")
    public List<User> getUSer(){

        this.logger.warn("This is working message");
        return  this.userService.getUser();
//        return "Testing message";
    }
}
