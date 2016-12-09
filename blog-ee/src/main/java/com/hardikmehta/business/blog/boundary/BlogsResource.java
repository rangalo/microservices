package com.hardikmehta.business.blog.boundary;

import com.hardikmehta.business.blog.control.BlogService;
import com.hardikmehta.business.blog.entity.Blog;
import org.slf4j.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * @author hardikm
 * @since 06/12/16
 * <p>
 * Class description
 */

@Stateless
@Path("blogs")
@Consumes("application/json")
@Produces("application/json")
public class BlogsResource {

    @Inject
    BlogService blogService;

    @Inject
    Logger logger;


    @GET
    public Response getAll() {

        logger.info("getAll");
        return Response.ok().entity(blogService.findAll()).build();
    }

    @POST
    public Response create(Blog blog) {

        logger.info("create");
        logger.info("blog=" + blog);
        return Response.created(null).entity(blogService.saveBlog(blog)).build();
    }

}
