package com.alweb29.schedulemanager.day.entity;

import com.alweb29.schedulemanager.month.entity.MonthClass;
import jakarta.persistence.*;

@Entity
@Table(name = "day")
public class DayClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "day_id")
    private int day_id;

    @ManyToOne
    @JoinColumn(name = "month_id")
    MonthClass monthClass;

    @Column(name = "day_number")
    private int day_number;

    public DayClass() {
    }

    public DayClass(int day_id, MonthClass month, int day_number) {
        this.day_id = day_id;
        this.monthClass = month;
        this.day_number = day_number;
    }

    public DayClass(MonthClass monthClass, int day_number) {
        this.monthClass = monthClass;
        this.day_number = day_number;
    }

    public int getDay_id() {
        return day_id;
    }

    public void setDay_id(int day_id) {
        this.day_id = day_id;
    }

    public MonthClass getMonthClass() {
        return monthClass;
    }

    public void setMonthClass(MonthClass month_id) {
        this.monthClass = month_id;
    }

    public int getDat_number() {
        return day_number;
    }

    public void setDat_number(int dat_number) {
        this.day_number = dat_number;
    }

    @Override
    public String toString() {
        return "DayClass{" +
                "day_id=" + day_id +
                ", month_id=" + monthClass.getMonth_id() +
                ", dat_number=" + day_number +
                '}';
    }
}
