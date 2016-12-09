package com.hardikmehta.resources;

import com.hardikmehta.entity.Blog;
import com.hardikmehta.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @author hardikm
 * @since 09/12/16
 * <p>
 * Class description
 */

@RestController
public class BlogController {

    @Autowired
    private BlogService blogService;

    @RequestMapping(value = "/v1/resources/blogs", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Blog>> allBlogs() {

        return ResponseEntity.ok(blogService.findAll());
    }


    @RequestMapping(value = "/v1/resources/blogs", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Blog> save(@Valid @RequestBody Blog blog) {

        return ResponseEntity.status(HttpStatus.CREATED).body(blogService.save(blog));
    }
}
