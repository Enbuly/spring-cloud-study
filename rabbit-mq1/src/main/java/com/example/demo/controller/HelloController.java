package com.example.demo.controller;

import com.example.demo.Server.Sender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    Sender sender;

    @GetMapping("/hi")
    public void home() {
        sender.send();
    }
}
