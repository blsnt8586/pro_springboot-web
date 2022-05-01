package com.zjf.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
public class RequestController {

    @GetMapping("/goto")
    public String goToPage(HttpServletRequest request) {
        request.setAttribute("msg","ok");
        request.setAttribute("code",200 );
        return "forward:/success";//转发到 /success请求
    }


    @GetMapping("/params")
    public  String testParam(Map<String,Object> map,
                             Model model,
                             HttpServletRequest request,
                             HttpServletResponse response){
        map.put("map","map,hello,world");
        model.addAttribute("model","model,hello,world");
        request.setAttribute("request","request,hello,world");
        Cookie cookie = new Cookie("c1","v1");
        cookie.setDomain("localhost");
        response.addCookie(cookie);
        return "forward:/success";

    }


    @ResponseBody
    @GetMapping("/success")
    public Map<String,Object> success(@RequestAttribute(value = "msg",required = false) String msg,
                       @RequestAttribute(value = "code",required = false) Integer code,
                       HttpServletRequest request){
//        Object msg1 = request.getAttribute("msg");
        Map<String,Object> map = new HashMap<>();
//        map.put("msg",msg);
//        map.put("code",code);
//        map.put("msg1",msg1);
        Object map1 = request.getAttribute("map");
        Object model = request.getAttribute("model");
        Object r = request.getAttribute("request");
        map.put("map1",map1);
        map.put("model",model);
        map.put("r",r);
        return map;
    }
}
