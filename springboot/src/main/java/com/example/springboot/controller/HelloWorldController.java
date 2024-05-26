package com.example.springboot.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping("/sayHello")
    public String sayHello() {
        return "hello world!";
    }

    @GetMapping("/sayBuenos")
    public String sayBuenos() {
        return "hello amigo!!";
    }

    @PostMapping("/add")
    public String add() {
        return "added";
    }

    @PutMapping("/update")
    public String update() {
        return "update";
    }

    @DeleteMapping("/delete")
    public String delete() {
        return "delete";
    }
}
