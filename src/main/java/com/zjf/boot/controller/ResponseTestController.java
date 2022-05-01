package com.zjf.boot.controller;

import com.zjf.boot.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class ResponseTestController {
    @ResponseBody
    @GetMapping("/test/person")
    public Person getPerson(){
        Person person = new Person("zjf",28,new Date(),null);
        return person;
    }
}
