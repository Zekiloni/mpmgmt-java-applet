/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobileplanmgmt.infrastructure.persistence;

import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Zekiloni
 */
public class DatabaseOperations {
    public <T> T save(T entity) {
        EntityManager entityManager = JpaManager.getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            T saved = entityManager.merge(entity);
            transaction.commit();
            return saved;
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
            return null;
        } finally {
            entityManager.close();
        }
    }

    public <T> void delete(Class<T> entityType, long entityId) {
        EntityManager entityManager = JpaManager.getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            T entity = entityManager.find(entityType, entityId);
            if (entity != null) {
                entityManager.remove(entity);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }

    public <T> Optional<T> getById(Class<T> entityType, long entityId) {
        EntityManager entityManager = JpaManager.getEntityManager();
        try {
            return Optional.ofNullable(entityManager.find(entityType, entityId));
        } finally {
            entityManager.close();
        }
    }

    public <T> List<T> getAll(Class<T> entityType) {
        EntityManager entityManager = JpaManager.getEntityManager();
        try {
            CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
            CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(entityType);
            Root<T> root = criteriaQuery.from(entityType);

            criteriaQuery.select(root);

            return entityManager.createQuery(criteriaQuery).getResultList();
        } finally {
            entityManager.close();
        }
    }
}
