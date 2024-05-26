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


    @GetMapping("/sayBuenos")
    public String sayBuenos() {
        return "hello amigo!!";
    }

    @PostMapping("/add")    // C -> CREATE
    public String add() {
        return "added";
    }

    @GetMapping("/sayHello") // R -> READ
    public String sayHello() {
        return "hello world!";
    }

    @PutMapping("/update")  // U -> UPDATE
    public String update() {
        return "update";
    }

    @DeleteMapping("/delete") // D -> DELETE
    public String delete() {
        return "delete";
    }
}
