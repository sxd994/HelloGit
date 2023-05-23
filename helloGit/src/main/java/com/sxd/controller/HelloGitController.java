package com.sxd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloGitController {
    @GetMapping
    public String hello(){
        System.out.println("helloGit");
        return "OK";
    }
}
