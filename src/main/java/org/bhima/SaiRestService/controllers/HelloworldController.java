package org.bhima.SaiRestService.controllers;

import org.bhima.SaiRestService.dto.Request;
import org.bhima.SaiRestService.dto.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

    //localhost:8080

    @GetMapping("/helloworld")
    public Response getHelloworld(@RequestBody Request request) {
        Response response = new Response(request.getFirstName(), request.getLastName());
        response.setDescription("Hey this is my description");
        // return new Response(request.getFirstName(), request.getLastName());
        return response;
    }
}
