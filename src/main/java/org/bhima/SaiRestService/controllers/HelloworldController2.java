package org.bhima.SaiRestService.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController2 {

    @GetMapping("/hello/{name}")
    public String getHelloworld(@PathVariable String name) {
        return "Helloworld " + name;
    }
}
