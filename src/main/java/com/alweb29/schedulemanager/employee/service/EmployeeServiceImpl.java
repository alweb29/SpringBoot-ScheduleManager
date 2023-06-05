package com.alweb29.schedulemanager.employee.service;

import com.alweb29.schedulemanager.employee.dao.EmployeeDAO;
import com.alweb29.schedulemanager.employee.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> result = Optional.ofNullable(employeeDAO.findById(id));

        Employee theEmployee = null;

        if (result.isPresent()) {
            theEmployee = result.get();
        } else {
            //if employee didn't find throw exception
            throw new RuntimeException("Did not find employee id of " + id);
        }
        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {
        return employeeDAO.save(theEmployee);
    }

    @Override
    public void deleteById(int id) {
        employeeDAO.deleteById(id);
    }
}
