package com.demo.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String home() {
        return "Bingo Bango Bish Bash Bush";
    }

    @GetMapping("/page")
    public String page() {
        return "Sneaky beaky like";
    }
}
