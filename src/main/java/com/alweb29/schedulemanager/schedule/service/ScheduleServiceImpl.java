package com.alweb29.schedulemanager.schedule.service;

import com.alweb29.schedulemanager.day.service.DayService;
import com.alweb29.schedulemanager.employee.service.EmployeeService;
import com.alweb29.schedulemanager.employeeshiftday.service.EmployeeShiftDayService;
import com.alweb29.schedulemanager.freedays.service.FreeDaysService;
import com.alweb29.schedulemanager.month.service.MonthService;
import com.alweb29.schedulemanager.shift.service.ShiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduleServiceImpl implements ScheduleService{
    private EmployeeService employeeService;
    private DayService dayService;
    private EmployeeShiftDayService employeeShiftDayService;
    private FreeDaysService freeDaysService;
    private MonthService monthService;
    private ShiftService shiftService;

    @Autowired
    public ScheduleServiceImpl(EmployeeService employeeService, DayService dayService, EmployeeShiftDayService employeeShiftDayService, FreeDaysService freeDaysService, MonthService monthService, ShiftService shiftService) {
        this.employeeService = employeeService;
        this.dayService = dayService;
        this.employeeShiftDayService = employeeShiftDayService;
        this.freeDaysService = freeDaysService;
        this.monthService = monthService;
        this.shiftService = shiftService;
    }


    @Override
    public void createSchedule() {
        
    }

    @Override
    public void printSchedule() {

    }

    @Override
    public void getSchedule() {

    }

    @Override
    public void deleteSchedule() {

    }
}
