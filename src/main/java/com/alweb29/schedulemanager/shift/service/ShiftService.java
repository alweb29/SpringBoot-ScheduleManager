package com.alweb29.schedulemanager.shift.service;

import com.alweb29.schedulemanager.shift.entity.Shift;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ShiftService {
    List<Shift> findAll();

    Shift findById(int id);

    Shift save(Shift theShift);

    void deleteById(int id);
}
