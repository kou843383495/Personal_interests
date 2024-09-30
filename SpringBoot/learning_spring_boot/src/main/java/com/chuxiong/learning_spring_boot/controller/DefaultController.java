package com.chuxiong.learning_spring_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "chuxiong") String name){
        return String.format("hello %s!", name);
    }
}
