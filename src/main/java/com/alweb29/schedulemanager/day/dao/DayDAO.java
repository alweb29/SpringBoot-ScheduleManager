package com.alweb29.schedulemanager.day.dao;

import com.alweb29.schedulemanager.day.entity.DayClass;

import java.util.List;

public interface DayDAO {

    List<DayClass> findAll();

    DayClass findById(int id);

    DayClass save(DayClass theDay);
    void deleteById(int id);

    void deleteByMonthId(int month_id);
}
