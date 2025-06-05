package com.team4.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("Rithik")
public class RithikController {
        @GetMapping("helloWorld")
        public String printRithik() {
            return "Hello from Rithik!";
        }
}
