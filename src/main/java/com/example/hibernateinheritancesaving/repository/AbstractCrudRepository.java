package com.example.hibernateinheritancesaving.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * @author Oleg Pavlyukov
 * on 11.02.2020
 * cpabox777@gmail.com
 */
@Repository
@Transactional
public abstract class AbstractCrudRepository<T> {

    @Autowired
    private EntityManager entityManager;

    protected abstract String entityName();

    public List<T> getAll() {
        String hqlQuery = "FROM " + entityName();
        return entityManager.createQuery(hqlQuery).getResultList();
    }

    public T getEntityById(Long id) {
        String jpqlQuery = "SELECT e FROM " + entityName() + " e" + " WHERE e.id = " + id;
        return (T) entityManager.createQuery(jpqlQuery).getSingleResult();
    }

    public T addEntity(T entity) {
        return entityManager.merge(entity);
    }

    public T updateEntity(T entity) {
        return entityManager.merge(entity);
    }

    public void deleteEntity(Long id) {
        entityManager.remove(getEntityById(id));
    }

}
