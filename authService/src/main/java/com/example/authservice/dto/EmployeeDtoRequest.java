package com.example.authservice.dto;


import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmployeeDtoRequest {
    String name;
    String surname;
    String password;
    String email;
    String phone;
    String address;
}
