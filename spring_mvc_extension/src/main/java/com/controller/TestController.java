package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/hello")
    public String testHello(){
        System.out.println(1/0);
        return "success";
    }
}
