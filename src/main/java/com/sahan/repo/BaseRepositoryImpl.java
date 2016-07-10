package com.sahan.repo;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sahan on 7/10/2016.
 */
@Repository
@Transactional
public class BaseRepositoryImpl implements BaseRepository {
    @Autowired
    private SessionFactory sessionFactory;

    public <T> List<T> viewAllBooks(Class<T> clazz) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(clazz);
        List<T> clazzType = criteria.list();
        session.close();
        return clazzType;
    }
}
