package com.alweb29.schedulemanager.shift.service;

import com.alweb29.schedulemanager.shift.dao.ShiftDAO;
import com.alweb29.schedulemanager.shift.entity.Shift;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShiftServiceImpl implements ShiftService{

    private ShiftDAO shiftDAO;

    @Autowired
    public ShiftServiceImpl(ShiftDAO shiftDAO) {
        this.shiftDAO = shiftDAO;
    }

    @Override
    public List<Shift> findAll() {
        return shiftDAO.findAll();
    }

    @Override
    public Shift findById(int id) {
        return shiftDAO.findById(id);
    }

    @Override
    public Shift save(Shift theShift) {
        return shiftDAO.save(theShift);
    }

    @Override
    public void deleteById(int id) {
        shiftDAO.deleteById(id);
    }
}
