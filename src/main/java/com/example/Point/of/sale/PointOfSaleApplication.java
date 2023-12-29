package com.example.Point.of.sale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class PointOfSaleApplication {
	public static void main(String[] args) {
		SpringApplication.run(PointOfSaleApplication.class, args);
	}
}
