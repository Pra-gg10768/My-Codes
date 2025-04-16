package com.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Company;
import com.model.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeRestController {

    private final Company company;

    public EmployeeRestController() {
        this.company = new Company(); 
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return company.getEmpList();
    }
}

