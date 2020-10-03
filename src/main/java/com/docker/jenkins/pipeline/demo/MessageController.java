package com.docker.jenkins.pipeline.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("messages")
public class MessageController {
    @GetMapping("/{userName}")
    public String sayHello(@PathVariable("userName") String userName){
        return "Hello "+userName;
    }
}
