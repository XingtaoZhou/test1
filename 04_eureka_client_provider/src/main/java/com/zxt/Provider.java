package com.zxt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//激活eurekaClient
@EnableEurekaClient
public class Provider {

	public static void main(String[] args) {
		SpringApplication.run(Provider.class, args);
	}

}
