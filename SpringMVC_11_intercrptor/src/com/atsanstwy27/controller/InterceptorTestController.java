package com.atkjs927.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InterceptorTestController {

    @RequestMapping("/test01")
    public String hello() {
        System.out.println("test01");
        //int i = 10 / 0;
        return "success";
    }

}
