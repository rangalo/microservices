package com.hardikmehta.repository;

import com.hardikmehta.entity.Blog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hardikm
 * @since 09/12/16
 * <p>
 * Class description
 */

@Repository
public interface BlogRepository extends CrudRepository<Blog, Long> {

}
