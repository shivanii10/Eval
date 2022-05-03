package com.example.FlightData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.example.FlightData")
public class FlightDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightDataApplication.class, args);
	}

}
