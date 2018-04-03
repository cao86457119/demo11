package com.example.demo3.com.example.demoInterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value="service-hi")
public interface ServiceClient {
    @RequestMapping(value="/hi")
    String sayHi();
}
