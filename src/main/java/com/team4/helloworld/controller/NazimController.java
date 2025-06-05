package com.team4.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class NazimController {

    @GetMapping("/myName")
    public String myName() {
        return "Nazim Ahmad";
    }

}
