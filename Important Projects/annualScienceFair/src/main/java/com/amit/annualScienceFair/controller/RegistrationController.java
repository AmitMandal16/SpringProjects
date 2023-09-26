package com.amit.annualScienceFair.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.amit.annualScienceFair.model.User;
import com.amit.annualScienceFair.service.UserService;

@Controller
public class RegistrationController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/performRegistration", method = RequestMethod.GET)
	public ModelAndView showReg(HttpServletRequest request, HttpServletResponse response) {

		ModelAndView view = new ModelAndView("registrationPage");
		view.addObject("user", new User());
		return view;
	}

	@RequestMapping(value = "/performRegistration", method = RequestMethod.POST)
	public String registrationProcess(@Valid @ModelAttribute("user") User user, BindingResult result) {

		if (result.hasErrors()) {

			return "registrationPage";

		}

		userService.registerUser(user);

		return "redirect:performLogin";
	}

}
