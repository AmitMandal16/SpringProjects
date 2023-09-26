package com.amit.annualScienceFair.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.amit.annualScienceFair.service.UserService;

public class EmailValidator implements ConstraintValidator<NotDuplicateEmail, String> {
	
	@Autowired
	private UserService userService;
	
	public void initialize(NotDuplicateEmail notExistingEmail) {
    }

	@Override
	public boolean isValid(String email, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return !userService.doesEmailExist(email);
	}

}
