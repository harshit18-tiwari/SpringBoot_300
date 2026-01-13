package com.example.Day1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Hello {
    @GetMapping("/")
    public String hello() {
        return "This is the first line";
    }

    @GetMapping("/about")
    public String about() {
        return "This is about message";
    }

    @GetMapping("/last")
    public String last() {
        return "This is the last page";
    }
}