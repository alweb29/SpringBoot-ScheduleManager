package com.alweb29.schedulemanager.employeeshiftday.service;

import com.alweb29.schedulemanager.employeeshiftday.dao.EmployeeShiftDayDAO;
import com.alweb29.schedulemanager.employeeshiftday.entity.EmployeeShiftDay;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeShiftDayServiceImpl implements EmployeeShiftDayService{

    private EmployeeShiftDayDAO employeeShiftDayDAO;

    public EmployeeShiftDayServiceImpl(EmployeeShiftDayDAO employeeShiftDayDAO) {
        this.employeeShiftDayDAO = employeeShiftDayDAO;
    }

    @Override
    public List<EmployeeShiftDay> findAll() {
        return employeeShiftDayDAO.findAll();
    }

    @Override
    public EmployeeShiftDay findById(int id) {
        return employeeShiftDayDAO.findById(id);
    }

    @Override
    public EmployeeShiftDay save(EmployeeShiftDay theRelation) {
        return employeeShiftDayDAO.save(theRelation);
    }

    @Override
    public void deleteById(int id) {
        employeeShiftDayDAO.deleteById(id);
    }
}
