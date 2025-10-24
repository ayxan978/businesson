package com.example.authservice.repository;

import com.example.authservice.model.BossModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BossRepository extends JpaRepository<BossModel, Long> {
    Optional<BossModel> loginBoss(String email,String password);

}
