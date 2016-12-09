package com.hardikmehta.business.blog.control;

import com.hardikmehta.business.blog.entity.Blog;
import com.hardikmehta.business.blog.repository.BlogRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

/**
 * @author hardikm
 * @since 06/12/16
 * <p>
 * Class description
 */

@Stateless
public class BlogService {

    @Inject
    BlogRepository blogRepository;


    public List<Blog> findAll() {

        return blogRepository.findAll();
    }

    public Blog saveBlog(Blog blog) {

        return blogRepository.save(blog);
    }

}
