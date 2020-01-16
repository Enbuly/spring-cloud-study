package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka的服务注册平台
 *
 * @author lazy cat
 * @since 2020-01-16
 **/
@EnableEurekaServer
@SpringBootApplication
public class ServerApplication {

    //访问路径http://localhost:8761
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }
}
