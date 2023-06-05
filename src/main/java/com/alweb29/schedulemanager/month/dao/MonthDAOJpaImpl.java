package com.alweb29.schedulemanager.month.dao;

import com.alweb29.schedulemanager.month.entity.MonthClass;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class MonthDAOJpaImpl implements MonthDAO{

    EntityManager entityManager;

    @Autowired
    public MonthDAOJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<MonthClass> findAll() {
        TypedQuery<MonthClass> theQuery = entityManager.createQuery("from MonthClass ", MonthClass.class);

        List<MonthClass> months = theQuery.getResultList();

        return months;
    }

    @Override
    public MonthClass findById(int month_id) {
        MonthClass month = entityManager.find(MonthClass.class, month_id);

        return month;
    }

    @Override
    @Transactional
    public MonthClass save(MonthClass month) {
        MonthClass dbMonth = entityManager.merge(month);

        return dbMonth;
    }

    @Override
    @Transactional
    public void deleteById(int id) {

        MonthClass month = entityManager.find(MonthClass.class, id);

        entityManager.remove(month);
    }
}
