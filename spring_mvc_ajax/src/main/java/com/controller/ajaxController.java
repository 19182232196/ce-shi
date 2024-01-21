package com.controller;

import com.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Controller
@RequestMapping(value = "/test")
public class ajaxController {
    @RequestMapping(value = "/ajax")
    public void testajax(Integer id, HttpServletResponse response) throws IOException {
        System.out.println("id:"+id);
        response.getWriter().write("Hello,axios");
    }
    @RequestMapping(value = "/requestBodyJson")
    public void testRequestBodyJson(@RequestBody User user, HttpServletResponse response) throws IOException {
        System.out.println(user);
        response.getWriter().write("Hello,requestBodyJson");
    }
    @RequestMapping(value = "/ResponseBody")
    @ResponseBody
    public String testResponseBody(){
        return "success";
    }
    @RequestMapping(value = "/responseBodyJson")
    @ResponseBody
    public Map<String, Object> testResponseBodyJson(){
        User user = new User(1,"qwer","123456",20,"male");
        User user2 = new User(2,"asdf","123456",20,"male");
        User user3 = new User(3,"zxcv","123456",20,"male");
        Map<String, Object> map = new HashMap<>();
        map.put("1",user);
        map.put("2",user2);
        map.put("3",user3);
        return map;
    }
}
