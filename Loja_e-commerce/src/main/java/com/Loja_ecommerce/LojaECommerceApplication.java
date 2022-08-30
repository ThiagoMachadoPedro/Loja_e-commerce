package com.Loja_ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.**")
public class LojaECommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojaECommerceApplication.class, args);
	}

}
