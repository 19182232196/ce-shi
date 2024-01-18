package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("test")
public class Hello {
    @RequestMapping(
            value = {"/hello","/world","/qw?r/t*tant","rest/{username}/{id}"},
            method = {RequestMethod.POST, RequestMethod.GET}
    )
    public String hello(@PathVariable("id") Integer id, @PathVariable("username") String username){
        System.out.println("id = " + id + ":" +" username = " + username);
        return "success";
    }
    @RequestMapping("/param/servletAPI")
    public String Param(HttpServletRequest request){
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username = " + username + " password = " + password);
        return "success";
    }
    @RequestMapping("/param")
    public String Param(@RequestParam(value= "username", required = false,defaultValue = "hello")
                        String username, String password,
                        @RequestHeader("referer") String referer,
                        @CookieValue("JSESSIONID") String jessionId){
        System.out.println("jessionId = " + jessionId);
        System.out.println("referer = " + referer);
        System.out.println("username = " + username + " password = " + password);
        return "success";
    }
}