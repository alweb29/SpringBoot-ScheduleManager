package com.alweb29.schedulemanager.freedays.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "freeday")
public class FreeDays {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "freeday_id")
    private int freeDay_id;

    @Column(name = "employee_id")
    private int employee_id;

    @Column(name = "day_id")
    private int day_id;

    public FreeDays() {
    }

    public FreeDays(int employee_id, int day_id) {
        this.employee_id = employee_id;
        this.day_id = day_id;
    }

    public FreeDays(int freeday_id, int employee_id, int day_id) {
        this.freeDay_id = freeday_id;
        this.employee_id = employee_id;
        this.day_id = day_id;
    }

    public int getFreeDay_id() {
        return freeDay_id;
    }

    public void setFreeDay_id(int freeday_id) {
        this.freeDay_id = freeday_id;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public int getDay_id() {
        return day_id;
    }

    public void setDay_id(int day_id) {
        this.day_id = day_id;
    }

    @Override
    public String toString() {
        return "FreeDays{" +
                "freeday_id=" + freeDay_id +
                ", employee_id=" + employee_id +
                ", day_id=" + day_id +
                '}';
    }
}
