package com.hardikmehta.resources;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hardik on 18.02.18.
 */
@RestController
public class InfoController {


    @RequestMapping(value = "/v1/resources/info", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> allBlogs() {

        return ResponseEntity.ok("Running version 1.0 of super blog");
    }

}
