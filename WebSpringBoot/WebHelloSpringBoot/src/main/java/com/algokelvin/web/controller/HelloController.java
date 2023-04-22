package com.algokelvin.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {

    @GetMapping("/hellobasic")
    public String hello() {
        return "Hello, Spring Boot Version Basic";
    }

    @GetMapping("/hellowebhtml")
    public ModelAndView hellowebhtml() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello"); // set view name
        modelAndView.addObject("message", "<h1>Hello</h1>"); // add model attribute
        return modelAndView;
    }

}
