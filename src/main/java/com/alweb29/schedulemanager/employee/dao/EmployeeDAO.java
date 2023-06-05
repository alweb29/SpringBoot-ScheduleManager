package com.alweb29.schedulemanager.employee.dao;

import com.alweb29.schedulemanager.employee.entity.Employee;

import java.util.List;

public interface EmployeeDAO{

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee theEmployee);
    void deleteById(int id);
}
