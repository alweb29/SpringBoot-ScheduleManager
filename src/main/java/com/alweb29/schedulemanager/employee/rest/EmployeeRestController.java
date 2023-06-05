package com.alweb29.schedulemanager.employee.rest;

import com.alweb29.schedulemanager.employee.entity.Employee;
import com.alweb29.schedulemanager.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @GetMapping("/employee/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId){

        Employee theEmployee = employeeService.findById(employeeId);

        return theEmployee;
    }

    //Post employee
    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee theEmployee){

        theEmployee.setEmployee_id(0);
        Employee dbEmployee = employeeService.save(theEmployee);

        return dbEmployee;
    }

    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee employee){
        Employee dbEmployee = employeeService.save(employee);

        return dbEmployee;
    }

    @DeleteMapping("/employee/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId){
        Employee tempEmployee = employeeService.findById(employeeId);

        if (tempEmployee == null){
            throw new RuntimeException("This employee doesnt exist");
        }

        employeeService.deleteById(employeeId);

        return "Employee with id " + employeeId + " deleted";
    }
}
