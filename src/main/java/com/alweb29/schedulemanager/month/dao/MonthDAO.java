package com.alweb29.schedulemanager.month.dao;

import com.alweb29.schedulemanager.month.entity.MonthClass;

import java.util.List;

public interface MonthDAO {
    List<MonthClass> findAll();

    MonthClass findById(int month_id);

    MonthClass save(MonthClass month);

    void deleteById(int id);
}
