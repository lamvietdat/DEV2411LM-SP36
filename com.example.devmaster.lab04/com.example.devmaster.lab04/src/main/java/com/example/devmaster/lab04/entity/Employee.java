package com.example.devmaster.lab04.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
    private Long id;
    private String fullName;
    private String gender;
    private int age;
    private double salary;
}

