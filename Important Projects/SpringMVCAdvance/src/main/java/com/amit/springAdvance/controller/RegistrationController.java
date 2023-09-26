package com.amit.springAdvance.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amit.springAdvance.model.Registration;

@Controller
@RequestMapping("/du")
public class RegistrationController {
	
	@RequestMapping(value = "/register", method=RequestMethod.GET)
	public String getRegistration(Model model) {
		
	   Registration reg = new Registration();
	   
	   model.addAttribute("register", reg);
		
		return "registration_view";
		
	}
	
	@RequestMapping(value = "/submit", method=RequestMethod.POST)
	public String submission(@Valid @ModelAttribute("register") Registration reg, BindingResult result, Model model) {
		
		
		if(result.hasErrors()) {
			System.out.println("form has errors");
			return "registration_view";
		}
		
			return "submission_view";
		
		
	}

}
