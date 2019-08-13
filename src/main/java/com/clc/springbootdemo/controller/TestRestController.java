package com.clc.springbootdemo.controller;

import com.clc.springbootdemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    public Object test(){
        return "call success";
    }

    @RequestMapping("/getList")
    public Object getList(){
        return testService.getList();
    }
}
