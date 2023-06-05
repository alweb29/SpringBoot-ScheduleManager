package com.alweb29.schedulemanager.employeeshiftday.dao;

import com.alweb29.schedulemanager.day.entity.DayClass;
import com.alweb29.schedulemanager.employeeshiftday.entity.EmployeeShiftDay;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeShiftDayDAOImpl implements EmployeeShiftDayDAO{

    private EntityManager entityManager;

    public EmployeeShiftDayDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<EmployeeShiftDay> findAll() {
        TypedQuery<EmployeeShiftDay> theQuery = entityManager.createQuery("from EmployeeShiftDay ", EmployeeShiftDay.class);

        List<EmployeeShiftDay> relations = theQuery.getResultList();

        return relations;
    }

    @Override
    public EmployeeShiftDay findById(int id) {
        return entityManager.find(EmployeeShiftDay.class, id);
    }

    @Override
    @Transactional
    public EmployeeShiftDay save(EmployeeShiftDay theRelation) {
        EmployeeShiftDay employeeShiftDay = entityManager.merge(theRelation);

        return employeeShiftDay;
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        EmployeeShiftDay relation = entityManager.find(EmployeeShiftDay.class, id);

        entityManager.remove(relation);
    }
}
