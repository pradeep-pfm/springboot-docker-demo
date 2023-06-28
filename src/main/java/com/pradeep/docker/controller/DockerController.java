package com.pradeep.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/docker")
public class DockerController {
    @GetMapping("/doc")
    public String dockerDemo() {
        return "Dockerizing spring boot apllication";
    }
}
