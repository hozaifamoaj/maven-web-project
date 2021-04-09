package com.test.demomavenjen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class BookController {

    @GetMapping("/hello")
    public String hello(){
        return "Hellow world";
    }
}
