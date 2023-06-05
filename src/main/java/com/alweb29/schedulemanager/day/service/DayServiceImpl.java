package com.alweb29.schedulemanager.day.service;

import com.alweb29.schedulemanager.day.dao.DayDAO;
import com.alweb29.schedulemanager.day.entity.DayClass;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DayServiceImpl implements DayService{

    private DayDAO dayDAO;

    public DayServiceImpl(DayDAO dayDAO) {
        this.dayDAO = dayDAO;
    }

    @Override
    public List<DayClass> findAll() {
        return dayDAO.findAll();
    }

    @Override
    public DayClass findById(int day_id) {
        return dayDAO.findById(day_id);
    }

    @Override
    public DayClass save(DayClass day) {
        return dayDAO.save(day);
    }

    @Override
    public void deleteById(int id) {
        dayDAO.deleteById(id);
    }
    @Override
    public void deleteByMonthId(int month_id) {
        dayDAO.deleteByMonthId(month_id);
    }
}
