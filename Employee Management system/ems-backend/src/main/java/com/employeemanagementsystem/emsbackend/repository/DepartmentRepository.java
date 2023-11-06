package com.employeemanagementsystem.emsbackend.repository;

import com.employeemanagementsystem.emsbackend.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
