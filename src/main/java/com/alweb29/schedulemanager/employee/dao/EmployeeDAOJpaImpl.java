package com.alweb29.schedulemanager.employee.dao;

import com.alweb29.schedulemanager.employee.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        //create a query
        TypedQuery<Employee> theQuery = entityManager.createQuery("from  Employee ", Employee.class);

        //execute query get result
        List<Employee> employees = theQuery.getResultList();

        //return result
        return employees;
    }

    @Override
    public Employee findById(int id) {

        Employee employee = entityManager.find(Employee.class, id);

        return employee;
    }

    @Override
    @Transactional
    public Employee save(Employee theEmployee) {

        //if id == 0 insert else - update
        Employee dbEmployee = entityManager.merge(theEmployee);

        //return new employee
        return dbEmployee;
    }

    @Override
    @Transactional
    public void deleteById(int id) {

        //find employee
        Employee employee = entityManager.find(Employee.class, id);

        //delete this employee
        entityManager.remove(employee);
    }

}
