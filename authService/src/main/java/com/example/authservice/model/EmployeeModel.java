package com.example.authservice.model;


import com.example.authservice.authEnum.BossRoles;
import com.example.authservice.function.PasswordGenerate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.security.SecureRandom;

@Entity
@Data
@Setter
@Getter
public class EmployeeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String surname;

    private String password = PasswordGenerate.generateRandomPassword(8);

    private String email;

    private String phone;

    private String address;

    private BossRoles role;


    EmployeeModel(BossRoles role) {
        this.role = role;
    }

    public EmployeeModel() {

    }

}
