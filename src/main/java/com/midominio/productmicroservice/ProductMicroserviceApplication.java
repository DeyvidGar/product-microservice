package com.midominio.productmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Principal class in spring boot microservice.
 *
 * @author David G.
 * @version 1.0-
 */
@SpringBootApplication
public class ProductMicroserviceApplication {

	/**
	 * Main method for the microservice.
	 * 
	 * @param args parameters.
	 */
	public static void main(String[] args) {
		SpringApplication.run(ProductMicroserviceApplication.class, args);
	}

}
