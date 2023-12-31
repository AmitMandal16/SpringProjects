package com.amit.springSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	
	@GetMapping("/")
	public String getWelcomePage() {
		
		return "welcome";
	}

	@GetMapping("/home")
	public String getHomePage() {
		
		return "homePage";
	}
	
	@GetMapping("/admin")
	public String getAdminPage() {
		
		return "admin";
	}
	
	@GetMapping("/login")
	public String getLoginPage() {
		
		return "login";
	}
}
