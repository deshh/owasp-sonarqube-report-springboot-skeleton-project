package com.testing.codequality.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/home")
public class HomeController {

    private static final Logger LOG = LogManager.getLogger(HomeController.class);

    @GetMapping("/{id}")
    public String getHomeControllerStringById(@PathVariable int id) {
        LOG.info("Home Controller info log");
        return String.format("HomeController id: %d", id);
    }
}
