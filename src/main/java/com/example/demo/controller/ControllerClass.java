package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ControllerClass {

    @Value("${test.prop}")
    private String prop;

    @GetMapping("/test123")
    public String giveBack() {
        return prop;
    }
}
