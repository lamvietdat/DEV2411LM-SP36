package com.example.devmaster.lab04.dto;


import lombok.*;
import jakarta.validation.constraints.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MonHocDTO {
    @Size(min = 2, max = 2)
    private String mamh;

    @Size(min = 5, max = 50)
    private String tenmh;

    @Min(45)
    @Max(75)
    private int sotiet;
}

