package com.example.demo.dao;

import java.util.List;


import com.example.demo.entity.EmployeeRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    public EmployeeDaoImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    NamedParameterJdbcTemplate template;

    @Override
    public List<Employee> findAll() {
        return template.query("select * from employee", new EmployeeRowMapper());
    }
}
