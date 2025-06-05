package com.team4.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("anmol")
public class AnmolController {
    @GetMapping("helloWorld")
    public String printAnmol() {
        return "Hello World from Anmol!";
    }
}
