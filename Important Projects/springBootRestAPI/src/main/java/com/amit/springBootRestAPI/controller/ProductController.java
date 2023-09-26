package com.amit.springBootRestAPI.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amit.springBootRestAPI.model.Product;
import com.amit.springBootRestAPI.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
    ProductService productService;
	
	@GetMapping("/getAllProducts")
	public List<Product> getAllProduct(){
		
		return  productService.getAllProducts();
	}
	
	@GetMapping("/getAllProducts/{id}")
	public Optional<Product> getAllProductById(@PathVariable("id") Long id){
		
		return  productService.getById(id);
	}
	
	@PostMapping("/addProduct")
	public void addProduct(@RequestBody Product prod) {	
		productService.addProduct(prod);
		
	}
	
	@PutMapping("/updateProduct/{id}")
	public void updateProduct(@RequestBody Product prod, @PathVariable("id")Long id) {
		
		productService.update(id, prod);
		
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id")Long id) {
		
		productService.delete(id);
	}
	
}
