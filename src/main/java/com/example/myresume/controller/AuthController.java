package com.example.myresume.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    private String loginTOweb(){
        return "auth/login";
    }

    @GetMapping("register")
    public String getRegister(){
        return "auth/login";
    }

}
