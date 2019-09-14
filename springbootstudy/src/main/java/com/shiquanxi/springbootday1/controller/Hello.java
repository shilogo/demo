package com.shiquanxi.springbootday1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/index")
    public String hello(){
        return  "hello";
    }

}
