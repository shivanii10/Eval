package com.example.PassengerData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackages="com.example.PassengerData")
@CrossOrigin(value="http://localhost:4200")
@EnableFeignClients("com.example.PassengerData")
public class PassengerDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassengerDataApplication.class, args);
	}
	
	@Bean
	public RestTemplate getTemplate()
	{
		return new RestTemplate();
	}

}
