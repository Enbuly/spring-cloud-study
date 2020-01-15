package com.example.eurekazuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * api网关服务
 *
 * @author lazy cat
 * @since 2020-01-15
 **/
@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaZuulApplication {

    //访问http://localhost:8769/api-a/hi?name=lazy
    public static void main(String[] args) {
        SpringApplication.run(EurekaZuulApplication.class, args);
    }

}
