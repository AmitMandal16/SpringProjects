package com.amit.springBootRestAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.amit.springBootRestAPI.model.Product;

@Controller
public class ProductWebController {
	
	
	@Autowired
	ProductController productController;
	
	@GetMapping("/")
	public String getAllProducts(Model model){
		
		List<Product> list= productController.getAllProduct();
		
		model.addAttribute("products", list);
		
		return "list_products";
		
	}
	
	@GetMapping("/addProducts")
	public String addProduct(Product product, Model model) {
		
		model.addAttribute("product", product);
		
		return "new_product";
		
	}
	
	@PostMapping("/save_new")
	public String saveProduct(@ModelAttribute("products") Product product) {
		
		productController.addProduct(product);
		
		return "redirect:/";
		
	}
	
	@GetMapping("/update_product/{id}")
	public String editDetails(@PathVariable("id") Long id, Model model) {
		
		model.addAttribute("product" , productController.getAllProductById(id));
		
		return "update_product";
		
	}
	
	
	@PostMapping("/save_product")
	public String updateDetails(@ModelAttribute("product") Product prod) {
		
		productController.updateProduct(prod, prod.getId());
		
		return "redirect:/";
		
	}
	

	@GetMapping("/delete_product/{id}")
	public String deleteDetails(@PathVariable("id") Long id, Model model) {
		
		model.addAttribute("product" , productController.getAllProductById(id));
		
		return "delete_product";
		
	}
	
	@PostMapping("/save_product")
	public String saveDeleteDetails(@ModelAttribute("product") Product prod) {
		
		productController.delete(prod.getId());
		
		return "redirect:/";
		
	}
	
	

}
