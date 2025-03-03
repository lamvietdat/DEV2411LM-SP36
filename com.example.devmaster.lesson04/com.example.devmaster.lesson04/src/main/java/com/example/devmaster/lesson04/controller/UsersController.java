package com.example.devmaster.lesson04.controller;

import com.example.devmaster.lesson04.dto.UsersDTO;
import com.example.devmaster.lesson04.entity.User;
import com.example.devmaster.lesson04.service.UsersService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
public class UsersController {
    @Autowired
    UsersService usersService;

    @GetMapping("/user-list")
    public List<User> getAllUsers(){
        return usersService.findAll();
    }

    @PostMapping("/user-add")
    public ResponseEntity<String> addUser(@Valid @RequestBody UsersDTO user){
        usersService.create(user);
        return ResponseEntity.badRequest().body("User created successfully");
    }
}
