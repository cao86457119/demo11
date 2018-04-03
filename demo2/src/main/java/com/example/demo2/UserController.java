package com.example.demo2;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @org.springframework.beans.factory.annotation.Value("${server.port}")
    public String port;

    @RequestMapping("/hi")
    public String home(){
        return "hi ,i am from port:" +port;
    }

}
