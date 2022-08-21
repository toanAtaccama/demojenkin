package com.toanlv.jenkindemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "xin chao Toan le" ;
    }

    @GetMapping("")
    public String home(){
        return "Xin chao den voi spring app jenkins demo";
    }
}
