package com.alweb29.schedulemanager.shift.dao;


import com.alweb29.schedulemanager.shift.entity.Shift;
import jakarta.persistence.EntityManager;

import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class ShiftDAOImpl implements ShiftDAO{

    private EntityManager entityManager;

    @Autowired
    public ShiftDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Shift> findAll() {
        TypedQuery<Shift> theQuery = entityManager.createQuery("from Shift ", Shift.class);

        List<Shift> shifts = theQuery.getResultList();

        return shifts;
    }

    @Override
    public Shift findById(int id) {
        return entityManager.find(Shift.class, id);
    }

    @Override
    public Shift save(Shift theShift) {
         Shift dbShift = entityManager.merge(theShift);

         return dbShift;
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        Shift shift = entityManager.find(Shift.class, id);
        entityManager.remove(shift);
    }

}
