package com.zjf.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/1.jpg")
    public String hello(){
        return "aaa";
    }

}
