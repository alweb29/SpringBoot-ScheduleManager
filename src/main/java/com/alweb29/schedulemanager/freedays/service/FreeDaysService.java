package com.alweb29.schedulemanager.freedays.service;

import com.alweb29.schedulemanager.freedays.entity.FreeDays;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FreeDaysService {
    List<FreeDays> findAll();

    FreeDays findById(int id);

    FreeDays save(FreeDays freeDay);

    void deleteById(int id);
}
