package com.hardikmehta.business.blog.repository;

import com.hardikmehta.business.blog.entity.Blog;
import com.hardikmehta.business.common.repository.AbstractGenericRepository;

import javax.inject.Named;
import javax.persistence.Query;
import java.util.List;

/**
 * @author hardikm
 * @since 06/12/16
 * <p>
 * Class description
 */

@Named
public class BlogRepository extends AbstractGenericRepository<Blog> {

    @Override
    @SuppressWarnings("unchecked")
    public List<Blog> findAll() {

        Query namedQuery = entityManager.createNamedQuery(Blog.QUERY_ALL);
        return (List<Blog>) namedQuery.getResultList();
    }
}
