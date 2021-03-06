package com.example.eurekafeign.api;

import com.example.eurekafeign.web.ServiceHiHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 服务service
 *
 * @author lazy cat
 * @since 2020-01-16
 **/
@FeignClient(value = "service-hi", fallback = ServiceHiHystrix.class)
public interface ServiceHi {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
