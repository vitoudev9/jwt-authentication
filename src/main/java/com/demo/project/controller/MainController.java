package com.demo.project.controller;

import com.demo.project.model.Users;
import com.demo.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String home() {
        return "Bingo Bango Bish Bash Bush";
    }

    @GetMapping("/page")
    public String page() {
        return "Sneaky beaky like";
    }

    @GetMapping("/hi")
    public String hi() {
        return "Why it's not printing";
    }

    @PostMapping("/register")
    public Users registerUsers(@RequestBody Users user) {
        return userService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody Users user) {
        return userService.verify(user);
    }
}
