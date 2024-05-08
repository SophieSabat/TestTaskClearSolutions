package com.example.testtaskclearsolutions.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class User {

    public Long id;

    @NotNull
    @Email
    public String email;

    @NotNull
    public String firstName;

    @NotNull
    public String lastName;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @Past
    public LocalDate birthdate;

    public String address;
    public String phoneNumber;

}
