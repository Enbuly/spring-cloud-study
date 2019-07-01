package com.example.demo.Server;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

@Component
public class Sender {

    @Resource
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String msg = "hello rabbitmq:" + new Date();
        System.out.println("Sender:" + msg);
        this.rabbitTemplate.convertAndSend("hello", msg);
    }
}
