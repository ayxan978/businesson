package com.example.authservice.model;


import com.example.authservice.authEnum.BossRoles;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Setter
@Getter
public class BossModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String password;
    private String email;
    private String phone;
    private String address;

    private BossRoles role;


    BossModel(BossRoles role) {
        this.role = role;
    }

    public BossModel() {

    }
}
