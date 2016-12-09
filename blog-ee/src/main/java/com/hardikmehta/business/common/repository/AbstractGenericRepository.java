package com.hardikmehta.business.common.repository;

import com.hardikmehta.business.common.entity.AbstractEntity;
import org.slf4j.Logger;

import javax.inject.Inject;
import javax.persistence.EntityManager;


/**
 * @author hardikm
 * @since 06/12/16
 * <p>
 * Class description
 */
abstract public class AbstractGenericRepository<T extends AbstractEntity> implements GenericRepository<T> {

    @Inject
    protected EntityManager entityManager;


    @Inject
    Logger logger;


    @Override
    public T findById(Object id, Class<T> entityClass) {

        return entityManager.find(entityClass,id);
    }

    @Override
    public T save(T entity) {

        entityManager.persist(entity);
        entityManager.flush();
        return entity;
    }

    @Override
    public void update(T entity) {

        entityManager.merge(entity);

    }

    @Override
    public void delete(Object id, Class<T> entityClass) {

        T byId = findById(id, entityClass);
        if (null == byId) {

            logger.warn("Could not find object with id={}, cannot delete", id);

        } else {

            entityManager.remove(byId);
        }
    }

    @Override
    public void flush() {

    }
}
