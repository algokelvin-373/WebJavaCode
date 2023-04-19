package com.algokelvin.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hellobasic")
    public String hello() {
        return "Hello, Spring Boot Version Basic";
    }

}
