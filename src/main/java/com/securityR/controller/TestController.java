package com.securityR.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {


    @GetMapping("/testing")
    public String testing() {
        return "You are welcome to my app";
    }


    @GetMapping("/user")
    public String testingUser() {
        return "You are welcome USER";
    }


    @GetMapping("/testingAdmin")
    public String testingAdmin() {
        return "You are welcome ADMIN";
    }

    @GetMapping("/overAll")
    public String testingAdminSup() {
        return "You are welcome SUPER ADMIN";
    }
}
