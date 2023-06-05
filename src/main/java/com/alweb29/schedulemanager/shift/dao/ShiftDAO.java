package com.alweb29.schedulemanager.shift.dao;

import com.alweb29.schedulemanager.shift.entity.Shift;

import java.util.List;

public interface ShiftDAO {
    List<Shift> findAll();

    Shift findById(int id);

    Shift save(Shift theShift);

    void deleteById(int id);
}
