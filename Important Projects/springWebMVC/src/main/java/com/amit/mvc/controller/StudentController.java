package com.amit.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@Autowired
	StudentManager studentManager;

	@RequestMapping(value = "/studentList", method = RequestMethod.GET)
	public String getStudent(Model model) {

		model.addAttribute("studentsList", studentManager.getStudentDetails());
		
		System.out.println(studentManager.getStudentDetails());
		return "students_view";

	}
	
	@RequestMapping(value = "/studentList/{name}", method = RequestMethod.GET)
	public String display(@PathVariable("name") String name, Model model) {
		
		String welcomeMsg = "Hi "+name+ " Welcome to Mandal University..";

		model.addAttribute("welcome", welcomeMsg);
		
		return "studentHome_view";

	}
	
	
	
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView listAction() {

		List<String> empList = new ArrayList<>();
		empList.add("Atul");
		empList.add("Abhinav");
		empList.add("Prince");
		empList.add("Gaurav");

		ModelAndView mv = new ModelAndView();

		mv.setViewName("index");
		mv.addObject("empList", empList);

		return mv;

	}

}
