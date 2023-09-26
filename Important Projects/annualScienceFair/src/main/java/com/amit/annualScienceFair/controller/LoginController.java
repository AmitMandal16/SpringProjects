package com.amit.annualScienceFair.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.amit.annualScienceFair.model.LogIn;
import com.amit.annualScienceFair.model.User;
import com.amit.annualScienceFair.service.UserService;

@Controller
public class LoginController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/performLogin", method = RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {

		ModelAndView view = new ModelAndView("login");

		view.addObject("login", new LogIn());

		return view;
	}

	@RequestMapping(value = "/performLogin", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("loginP") LogIn login, Model model) {

		ModelAndView modelAndView = null;

		User u = userService.validUser(login);
		if (u != null) {
			model.addAttribute("user", u);
			modelAndView = new ModelAndView("welcome");
		}

		else {

			modelAndView = new ModelAndView("login");
			modelAndView.addObject("message", "User doesn't exist, Kindly register youself and then login!!");

		}

		return modelAndView;
	}

}
