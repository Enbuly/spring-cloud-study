package com.example.demo.Server;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
@RabbitListener(queues = "hello")
public class Receiver {

    @Resource
    RestTemplate restTemplate;

    @RabbitHandler
    public void process(String msg) {
        String result = restTemplate.getForObject("http://SERVICE-HI/hi?name=" + msg, String.class);
        System.out.println("Receiver:" + result);
    }
}