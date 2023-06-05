package com.alweb29.schedulemanager.employee.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int employee_id;

    @Column(name = "employee_name")
    private String employee_name;

    @Column(name = "max_shifts_per_month")
    private int max_shifts_per_month;

    public Employee(){}

    public Employee(int employee_id, String employee_name, int max_shifts_per_month) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.max_shifts_per_month = max_shifts_per_month;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public int getMax_shifts_per_month() {
        return max_shifts_per_month;
    }

    public void setMax_shifts_per_month(int max_shifts_per_month) {
        this.max_shifts_per_month = max_shifts_per_month;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", employee_name='" + employee_name + '\'' +
                ", max_shifts_per_month=" + max_shifts_per_month +
                '}';
    }
}
