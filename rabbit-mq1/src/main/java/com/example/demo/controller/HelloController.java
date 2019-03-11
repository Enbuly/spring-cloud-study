package com.example.demo.controller;

import com.example.demo.Server.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    Sender sender;

    @GetMapping("/hi")
    public void home() {
        sender.send();
    }
}
