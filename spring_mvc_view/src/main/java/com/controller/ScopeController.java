package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class ScopeController {

    @RequestMapping("/test/mav")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg", ",hello mav");
        mav.setViewName("hello");
        return mav;
    }
    @RequestMapping("/test/model")
    public String index2(Model model) {
        model.addAttribute("msg", "hello model");
        return "hello";
    }
    @RequestMapping("/test/modelMap")
    public String index3(ModelMap ModelMap) {
        ModelMap.addAttribute("msg", "hello modelMap");
        return "hello";
    }
    @RequestMapping("/test/map")
    public String index4(Map<String, Object> map) {
        map.put("msg", "hello map");
        return "hello";
    }
    @RequestMapping("/test/session")
    public String index5(HttpSession session) {
        session.setAttribute("msg", "hello session");
        return "hello";
    }
    @RequestMapping("/test/application")
    public String index6(HttpSession session) {
        ServletContext application = session.getServletContext();
        application.setAttribute("msg", "hello application");
        return "hello";
    }
}
