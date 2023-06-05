package com.alweb29.schedulemanager.freedays.service;

import com.alweb29.schedulemanager.freedays.dao.FreeDaysDAO;
import com.alweb29.schedulemanager.freedays.entity.FreeDays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FreeDaysServiceImpl implements FreeDaysService {

    FreeDaysDAO freeDaysDAO;
    @Autowired
    public FreeDaysServiceImpl(FreeDaysDAO freeDaysDAO) {
        this.freeDaysDAO = freeDaysDAO;
    }

    @Override
    public List<FreeDays> findAll() {
        return freeDaysDAO.findAll();
    }

    @Override
    public FreeDays findById(int id) {
        return freeDaysDAO.findById(id);
    }

    @Override
    public FreeDays save(FreeDays freeDay) {
        return freeDaysDAO.save(freeDay);
    }

    @Override
    public void deleteById(int id) {
        freeDaysDAO.deleteById(id);
    }
}
