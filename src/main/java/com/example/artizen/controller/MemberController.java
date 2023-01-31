package com.example.artizen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    @GetMapping("/")
    public String hello() {
        return "hello";
    }
//
//    @GetMapping("/sample")
//    public String sample() {
//        return "sample";
//    }
}
