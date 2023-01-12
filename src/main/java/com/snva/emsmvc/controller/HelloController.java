package com.snva.emsmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.DispatcherServlet;


@Controller
@RequestMapping("/")
public class HelloController  {

    @RequestMapping( method = RequestMethod.GET)
    public String index(ModelMap modelMap){
        modelMap.put("message","I am the index");
        return "index";
    }

//
//    @RequestMapping(method = RequestMethod.GET)
//    public String contact(ModelMap modelMap){
//        modelMap.put("message","I am the contact");
//        return "contact";
//    }
//
//
//    @RequestMapping(method = RequestMethod.GET)
//    public String home(ModelMap modelMap){
//        modelMap.put("message","I am the home page");
//        return "home";
//    }

}
