package com.alweb29.schedulemanager.employeeshiftday.service;

import com.alweb29.schedulemanager.day.entity.DayClass;
import com.alweb29.schedulemanager.employeeshiftday.entity.EmployeeShiftDay;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeShiftDayService {
    List<EmployeeShiftDay> findAll();

    EmployeeShiftDay findById(int id);

    EmployeeShiftDay save(EmployeeShiftDay theRelation);

    void deleteById(int id);
}
