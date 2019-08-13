package com.clc.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/hello")
    public Object hello(ModelMap map){
        map.put("msg", "hello springboot");
        return "hello";
    }
}
