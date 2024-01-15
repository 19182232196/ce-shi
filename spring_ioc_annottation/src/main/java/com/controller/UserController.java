package com.controller;

import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller("controller")
public class UserController {
    @Autowired
//    @Qualifier("userServiceImpl")
    private UserService userService;
    public void saveUser(){
        userService.saveUser();
    }
}
