package com.microsvc.apigatewaysvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class ApiGatewaySvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewaySvcApplication.class, args);
	}

}
