package com.amit.springBootRestAPI.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amit.springBootRestAPI.model.Product;
import com.amit.springBootRestAPI.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	/*
	 * private List<Product> list = new ArrayList<>(Arrays.asList(new
	 * Product("P101", "Monitor", "Electronics"), new Product("P102", "Blanket",
	 * "HouseHold"), new Product("P103", "Laptop", "Electronics"), new
	 * Product("P104", "Shirt", "Fashion"), new Product("P105", "Pens", "School")));
	 */

	public List<Product> getAllProducts() {
		
		List<Product> list = new ArrayList<>();
		
		productRepository.findAll().forEach(list :: add);
		
     	return list;

	}

	/*
	 * public Product getProductById(String id) { return list.stream().filter(p->
	 * p.getId().equals(id)).findFirst().get();
	 * 
	 * }
	 */     
	
	public Optional<Product> getById(Long id) {
		
		return productRepository.findById(id);
	}
	
     public void addProduct(Product prod) {
   	 
    	 productRepository.save(prod);
     }
     
    /* public void update(String id, Product prod) {
    	 
    	 for(int i=0; i<list.size(); i++) {
    		 
    		 Product p= list.get(i);
    		 
    		 if(p.getId().equals(id)) {
    			 
    			 list.set(i, prod);
    			 
    			 return;
    			 
    		 }	 }
     } */
     
     public void update(Long id, Product p) {
    	 
    	 if(productRepository.findById(id).get()!= null) {
    		 productRepository.save(p);
    	 }
     }
     
     public void delete(Long id) {
    	 
    	 //list.removeIf(p->p.getId().equals(id));
    	 
    	 productRepository.deleteById(id);
    	 
     }
     
     

}
