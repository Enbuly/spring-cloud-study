package com.example.demo.controller;

import com.example.demo.server.HelloServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    HelloServer helloServer;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloServer.hiService(name);
    }
}
