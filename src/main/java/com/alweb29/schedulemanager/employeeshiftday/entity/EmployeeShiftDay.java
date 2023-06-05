package com.alweb29.schedulemanager.employeeshiftday.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employeeshiftday")
public class EmployeeShiftDay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "worker_shift_day_id")
    private int employee_shift_day_id;

    @Column(name = "shift_id")
    private int shift_id;

    @Column(name = "day_id")
    private int day_id;

    @Column(name = "employee_id")
    private int employee_id;

    public EmployeeShiftDay() {
    }

    public EmployeeShiftDay(int shift_id, int day_id, int employee_id) {
        this.shift_id = shift_id;
        this.day_id = day_id;
        this.employee_id = employee_id;
    }

    public int getEmployee_shift_day_id() {
        return employee_shift_day_id;
    }

    public void setEmployee_shift_day_id(int employee_shift_day_id) {
        this.employee_shift_day_id = employee_shift_day_id;
    }

    public int getShift_id() {
        return shift_id;
    }

    public void setShift_id(int shift_id) {
        this.shift_id = shift_id;
    }

    public int getDay_id() {
        return day_id;
    }

    public void setDay_id(int day_id) {
        this.day_id = day_id;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }
}
