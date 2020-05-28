package com.example.eurekafeign.web;

import com.example.eurekafeign.api.ServiceHi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 服务controller
 *
 * @author lazy cat
 * @since 2020-01-16
 **/
@RestController
public class HiController {

    @Resource
    private ServiceHi serviceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return serviceHi.sayHiFromClientOne(name);
    }
}
