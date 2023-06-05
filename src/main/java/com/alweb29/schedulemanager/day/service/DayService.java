package com.alweb29.schedulemanager.day.service;

import com.alweb29.schedulemanager.day.entity.DayClass;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DayService {

    List<DayClass> findAll();

    DayClass findById(int day_id);

    DayClass save(DayClass day);

    void deleteById(int id);
    void deleteByMonthId(int month_id);
}
