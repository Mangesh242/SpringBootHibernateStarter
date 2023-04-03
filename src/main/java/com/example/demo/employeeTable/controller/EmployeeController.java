package com.example.demo.employeeTable.controller;



import com.example.demo.employeeTable.entity.Employee;
import com.example.demo.employeeTable.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping(value="/api/empid")
    public List<Employee> getEmpById(){
        return repo.findAll();
    }

}