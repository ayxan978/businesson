package com.example.authservice.repository;

import com.example.authservice.model.BossModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<BossModel, Long> {
}
