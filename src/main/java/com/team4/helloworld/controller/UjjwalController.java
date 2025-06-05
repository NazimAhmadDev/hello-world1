package com.team4.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Ujjwal")
public class UjjwalController {
        @GetMapping("hello")
        public String printUjjwal() {
            return "Hello from Ujjwal!";
        }
}
