package com.example.demo.employeeTable.repository;

import com.example.demo.employeeTable.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
public interface EmployeeRepository extends JpaRepository<Employee,Float> {

    List<Employee> findAll();
}
