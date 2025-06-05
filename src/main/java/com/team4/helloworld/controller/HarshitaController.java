package com.team4.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("harshita")
public class HarshitaController {
    @GetMapping("helloWorld")
    public String printHarshita() {
        return "Hello World from Harshita!";
    }
}
