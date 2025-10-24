package com.example.authservice.repository;

import com.example.authservice.model.CompanyModel;
import com.example.authservice.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyModel, Long> {
}
