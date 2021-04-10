package com.test.demomavenjen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demomavenjen/")
public class BookController {

    @GetMapping("")
    public String welcome(){
        return "welcome home";
    }

    @GetMapping("hello")
    public String hello(){
        return "Hello world";
    }
}
