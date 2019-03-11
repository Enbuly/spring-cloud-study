package com.example.demo.Server;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RabbitListener(queues = "hello")
public class Receiver {

    @Autowired
    RestTemplate restTemplate;

    @RabbitHandler
    public void process(String msg) {
        restTemplate.getForObject("http://SERVICE-HI/hi?name=" + msg, String.class);
        System.out.println("Receiver:" + msg);
    }
}