package com.example.demo.ControllerLayer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "✅ BookStore Backend is Running!";
    }
}
