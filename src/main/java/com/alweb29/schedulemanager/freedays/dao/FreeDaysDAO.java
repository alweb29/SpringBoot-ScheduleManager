package com.alweb29.schedulemanager.freedays.dao;

import com.alweb29.schedulemanager.freedays.entity.FreeDays;


import java.util.List;

public interface FreeDaysDAO {
    List<FreeDays> findAll();

    FreeDays findById(int id);

    FreeDays save(FreeDays Freedays);

    void deleteById(int id);
}
