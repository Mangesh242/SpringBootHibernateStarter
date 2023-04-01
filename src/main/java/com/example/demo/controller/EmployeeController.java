package com.example.demo.controller;


import com.example.demo.dao.EmployeeDaoImpl;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class EmployeeController {

    @Resource
    EmployeeDaoImpl employeeService;

    @Autowired
    private EmployeeRepository repo;

    @GetMapping(value="/api/emp")
    public List<Employee> getEmp() {
     return   repo.findAll();
    }

    @GetMapping(value = "/employeeList")
    public List<Employee> getEmployees() {
        return employeeService.findAll();

    }


}