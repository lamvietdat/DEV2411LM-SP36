package com.devmaster.lesson02.pkg_annotation.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @GetMapping("/users")
    public String getUsers(){
        return "<h1>Get all users";
    }

    @PostMapping("/users")
    public String createUser(){
        return "<h1>User created";
    }

    @PutMapping("/users/{id}")
    public String updateUser(@PathVariable int id){
        return "<h1>User with ID"+id+"update";
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable int id){
        return "<h1>User with Id"+id+"deleted";
    }


}
