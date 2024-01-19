package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    @RequestMapping("/view")
    public String index() {
        return "hello";
    }
    @RequestMapping("/view2")
    public String index2() {
        return "forward:/test/model";
    }
    @RequestMapping("/view3")
    public String index3() {
        return "redirect:/test/model";
    }
}
