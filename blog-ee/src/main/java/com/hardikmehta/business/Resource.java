package com.hardikmehta.business;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 * @author hardikm
 * @since 06/12/16
 * <p>
 * Class description
 */
public class Resource {


    @Produces
    @PersistenceContext
    private EntityManager entityManager;



    @Produces
    public Logger getLogger(InjectionPoint ip) {

        String category = ip.getMember().getDeclaringClass().getName();
        return LoggerFactory.getLogger(category);
    }

}
