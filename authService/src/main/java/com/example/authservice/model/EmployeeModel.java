package com.example.authservice.model;


import com.example.authservice.authEnum.EmployeeRoles;
import com.example.authservice.function.PasswordGenerate;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmployeeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    String surname;

    String password = PasswordGenerate.generateRandomPassword(8);

    @Column(unique = true)
    String email;

    String phone;

    String address;


    int salary;

    EmployeeRoles role;


    EmployeeModel(EmployeeRoles role) {
        this.role = role;
    }


}
