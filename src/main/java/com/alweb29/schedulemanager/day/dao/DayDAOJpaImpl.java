package com.alweb29.schedulemanager.day.dao;

import com.alweb29.schedulemanager.day.entity.DayClass;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class DayDAOJpaImpl implements DayDAO{

    private EntityManager entityManager;

    @Autowired
    public DayDAOJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<DayClass> findAll() {
        TypedQuery<DayClass> theQuery = entityManager.createQuery("from DayClass ", DayClass.class);

        List<DayClass> days = theQuery.getResultList();

        return days;
    }

    @Override
    public DayClass findById(int id) {
        return entityManager.find(DayClass.class, id);
    }

    @Override
    @Transactional
    public DayClass save(DayClass theDay) {
        DayClass dbDay = entityManager.merge(theDay);

        return dbDay;
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        DayClass day = entityManager.find(DayClass.class, id);

        entityManager.remove(day);
    }

    @Override
    @Transactional
    public void deleteByMonthId(int month_id) {
        String jpql = "DELETE FROM DayClass d WHERE d.monthClass.month_id = :monthId";
        Query query = entityManager.createQuery(jpql);
        query.setParameter("monthId", month_id);
        query.executeUpdate();
    }
}
