package com.example.demo2;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication


public class Demo2Application {
	@ApiOperation(value="main 函数",notes="happy")
    @ApiImplicitParam(name = "user", value="hhhhuser",dataType = "String")
	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}
}
