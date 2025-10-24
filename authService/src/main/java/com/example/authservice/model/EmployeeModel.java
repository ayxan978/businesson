package com.example.authservice.model;


import com.example.authservice.authEnum.EmployeeRoles;
import com.example.authservice.function.PasswordGenerate;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity(name = "employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
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

    @Enumerated(EnumType.STRING)
    EmployeeRoles role;

}
