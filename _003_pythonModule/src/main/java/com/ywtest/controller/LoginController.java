package com.ywtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    public String login(){
        System.out.println(1);
        return "index.html";
    }

}
