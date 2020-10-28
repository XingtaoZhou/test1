package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller1 {

    @RequestMapping("/test1")
    public String test1(){
        return "test1";
    }
}
