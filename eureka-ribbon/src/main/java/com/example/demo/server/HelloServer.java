package com.example.demo.server;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServer {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
        //restTemplate.postForEntity();
        //restTemplate.postForObject();
        //restTemplate.postForLocation();
    }

    public String hiError(String name) {
        return "hi," + name + ",sorry,error!";
    }
}
