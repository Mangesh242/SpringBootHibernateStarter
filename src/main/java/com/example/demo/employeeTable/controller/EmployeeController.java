package com.example.demo.employeeTable.controller;



import com.example.demo.employeeTable.entity.Employee;
import com.example.demo.employeeTable.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository repo;

    @GetMapping(value="/api/emp")
    public List<Employee> getEmp() {
     return   repo.findAll();
    }

    @PostMapping("/api/emp/{id}")
    public ResponseEntity<Employee> getPersonById(@PathVariable Integer id) {
        Employee emp = repo.findById(id).orElse(null);
        if (emp != null) {
            return ResponseEntity.ok(emp);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}