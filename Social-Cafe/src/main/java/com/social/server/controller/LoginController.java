package com.social.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/hello")
    public String hello(){
        String helloMsg = "Hello Everyone";
        System.out.println(helloMsg);
        return helloMsg;
    }
}
