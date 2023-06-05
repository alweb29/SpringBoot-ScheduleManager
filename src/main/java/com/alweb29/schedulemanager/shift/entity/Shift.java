package com.alweb29.schedulemanager.shift.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "shift")
public class Shift {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shift_id")
    private int shift_id;

    @Column(name = "shift_name")
    private String shift_name;

    @Column(name = "shift_employees_count")
    private int shift_employees_count;

    public Shift() {
    }

    public Shift(String shift_name, int shift_employees_count) {
        this.shift_name = shift_name;
        this.shift_employees_count = shift_employees_count;
    }

    public Shift(int shift_id, String shift_name, int shift_employees_count) {
        this.shift_id = shift_id;
        this.shift_name = shift_name;
        this.shift_employees_count = shift_employees_count;
    }

    public int getShift_id() {
        return shift_id;
    }

    public void setShift_id(int shift_id) {
        this.shift_id = shift_id;
    }

    public String getShift_name() {
        return shift_name;
    }

    public void setShift_name(String shift_name) {
        this.shift_name = shift_name;
    }

    public int getShift_employees_count() {
        return shift_employees_count;
    }

    public void setShift_employees_count(int shift_employees_count) {
        this.shift_employees_count = shift_employees_count;
    }

    @Override
    public String toString() {
        return "Shift{" +
                "shift_id=" + shift_id +
                ", shift_name='" + shift_name + '\'' +
                ", shift_employees_count=" + shift_employees_count +
                '}';
    }
}
