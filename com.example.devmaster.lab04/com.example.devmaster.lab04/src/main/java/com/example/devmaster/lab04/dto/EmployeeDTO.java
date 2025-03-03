package com.example.devmaster.lab04.dto;

import lombok.*;
import jakarta.validation.constraints.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeeDTO {
    private Long id;

    @Size(min = 3, max = 25)
    private String fullName;

    @Min(18)
    @Max(60)
    private int age;

    @Positive
    private double salary;
}
