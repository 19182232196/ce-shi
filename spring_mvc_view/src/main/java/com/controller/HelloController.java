package com.controller;

import com.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
/*    @RequestMapping("/")
    public String index() {
        //设置视图名称
        return "index";
    }*/

    @RequestMapping("/hello")
    public String hello(User user) {
        System.out.println(user);
        return "hello";
    }
}