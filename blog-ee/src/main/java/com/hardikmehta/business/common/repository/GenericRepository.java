package com.hardikmehta.business.common.repository;

import com.hardikmehta.business.common.entity.AbstractEntity;

import java.util.List;

/**
 * @author hardikm
 * @since 06/12/16
 * <p>
 * Class description
 */
public interface GenericRepository<T extends AbstractEntity> {

    T findById ( Object id, Class<T> entityClass );

    List<T> findAll ();

    T save ( T entity );

    void update ( T entity );

    void delete (Object id, Class<T> entityClass);

    void flush ();

}
