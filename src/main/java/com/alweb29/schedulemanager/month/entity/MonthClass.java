package com.alweb29.schedulemanager.month.entity;

import com.alweb29.schedulemanager.day.entity.DayClass;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "month")
public class MonthClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "month_id")
    private int month_id;

    @Column(name = "month_name")
    private String month_name;

    @OneToMany(mappedBy = "monthClass", cascade = CascadeType.ALL)
    private List<DayClass> days;

    public MonthClass() {
    }

    public MonthClass(String month_name) {
        this.month_name = month_name;
    }

    public MonthClass(int month_id, String month_name, List<DayClass> days) {
        this.month_id = month_id;
        this.month_name = month_name;
        this.days = days;
    }

    // Getters and setters

    public int getMonth_id() {
        return month_id;
    }

    public void setMonth_id(int month_id) {
        this.month_id = month_id;
    }

    public String getMonth_name() {
        return month_name;
    }

    public void setMonth_name(String month_name) {
        this.month_name = month_name;
    }

    public List<DayClass> getDays() {
        return days;
    }

    public void setDays(List<DayClass> days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "MonthClass{" +
                "month_id=" + month_id +
                ", month_name='" + month_name + '\'' +
                '}';
    }
}

