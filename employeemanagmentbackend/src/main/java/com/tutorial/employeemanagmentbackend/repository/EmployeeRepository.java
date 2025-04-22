package com.tutorial.employeemanagmentbackend.repository;

import com.tutorial.employeemanagmentbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
