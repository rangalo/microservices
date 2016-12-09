package com.hardikmehta.service;

import com.hardikmehta.entity.Blog;
import com.hardikmehta.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author hardikm
 * @since 09/12/16
 * <p>
 * Class description
 */

@Service
@Transactional
public class BlogService {

    @Autowired
    private BlogRepository blogRepository;

    public Blog save(Blog blog) {

        return blogRepository.save(blog);
    }

    public List<Blog> findAll() {

        return (List<Blog>) blogRepository.findAll();
    }

}
