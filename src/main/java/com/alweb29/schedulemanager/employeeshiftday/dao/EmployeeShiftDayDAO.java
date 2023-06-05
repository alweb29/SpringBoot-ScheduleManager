package com.alweb29.schedulemanager.employeeshiftday.dao;

import com.alweb29.schedulemanager.day.entity.DayClass;
import com.alweb29.schedulemanager.employeeshiftday.entity.EmployeeShiftDay;

import java.util.List;

public interface EmployeeShiftDayDAO {
    List<EmployeeShiftDay> findAll();

    EmployeeShiftDay findById(int id);

    EmployeeShiftDay save(EmployeeShiftDay theRelation);
    void deleteById(int id);
}
