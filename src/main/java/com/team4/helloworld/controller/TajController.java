package com.team4.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Taj")
public class TajController {
    @GetMapping("helloWorld")
    public String printTaj() {
        return "Hello World from Taj";
    }
}
