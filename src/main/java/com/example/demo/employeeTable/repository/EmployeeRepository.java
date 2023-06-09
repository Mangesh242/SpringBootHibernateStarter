package com.example.demo.employeeTable.repository;

import com.example.demo.employeeTable.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    List<Employee> findAll();
}
