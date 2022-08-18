package com.example.baithi_api.repository;

import com.example.baithi_api.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> findAllByName(String name);
}
