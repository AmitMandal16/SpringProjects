package com.amit.mvc.controllerExamples;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
	
	
	@RequestMapping(value="/hello")
	public String viewName(Model model, HttpServletRequest request) {
		
		String name= request.getParameter("name");
		
		String message= "Hi Welcome" + name;
		
		model.addAttribute("value", message);
		
		return "greet_view";
	}
	
	@RequestMapping(value="/hello/anotherway")
	public String viewName2(Model model, @RequestParam String name) {
		
		//String name= request.getParameter("name");
		
		String message= "Hi Welcome" + name;
		
		model.addAttribute("value", message);
		
		return "greet_view";
	}
	
	

}
