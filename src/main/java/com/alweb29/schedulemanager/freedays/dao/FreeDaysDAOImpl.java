package com.alweb29.schedulemanager.freedays.dao;

import com.alweb29.schedulemanager.freedays.entity.FreeDays;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class FreeDaysDAOImpl implements FreeDaysDAO{

    private EntityManager entityManager;

    public FreeDaysDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<FreeDays> findAll() {
        TypedQuery<FreeDays> theQuery = entityManager.createQuery("from FreeDays ", FreeDays.class);

        List<FreeDays> freeDays = theQuery.getResultList();

        return freeDays;
    }

    @Override
    public FreeDays findById(int id) {
        return entityManager.find(FreeDays.class, id);
    }

    @Override
    public FreeDays save(FreeDays freeDay) {
        return entityManager.merge(freeDay);
    }

    @Override
    public void deleteById(int id) {
        FreeDays freeDay = entityManager.find(FreeDays.class, id);
        entityManager.remove(freeDay);
    }
}
