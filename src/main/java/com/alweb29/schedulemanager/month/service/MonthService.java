package com.alweb29.schedulemanager.month.service;

import com.alweb29.schedulemanager.month.entity.MonthClass;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MonthService {
    List<MonthClass> findAll();

    MonthClass findById(int month_id);

    MonthClass save(MonthClass month);

    void deleteById(int id);

    void generateDaysForMonth(MonthClass monthClass);

    public void deleteDaysByMonthId(int month_id);
}
