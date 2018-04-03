package com.example.demo3;

import com.example.demo3.com.example.demoInterface.ServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testControl {
    @Autowired
    ServiceClient serviceClient;

    @RequestMapping("/hi")
    public String sayhi()
    {
        return serviceClient.sayHi();
    }
}
