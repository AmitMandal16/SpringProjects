package com.amit.springBootRestAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.amit.springBootRestAPI.model.Product;
import com.amit.springBootRestAPI.repository.ProductRepository;

@SpringBootApplication
public class SpringBootRestApiApplication implements CommandLineRunner {
	
	@Autowired
	ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		productRepository.save(new Product("Monitor", "Electronics"));
		productRepository.save(new Product("Blanket", "HouseHold"));
		productRepository.save(new Product("Laptop", "Electronics"));
		productRepository.save(new Product("Pens", "School"));
		
		
	}

}
