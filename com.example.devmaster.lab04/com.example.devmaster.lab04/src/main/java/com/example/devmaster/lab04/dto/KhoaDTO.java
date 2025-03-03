package com.example.devmaster.lab04.dto;


import lombok.*;
import jakarta.validation.constraints.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class KhoaDTO {
    @NotBlank
    @Size(min = 2, max = 10)
    private String makh;

    @NotBlank
    @Size(min = 5, max = 25)
    private String tenkh;
}
