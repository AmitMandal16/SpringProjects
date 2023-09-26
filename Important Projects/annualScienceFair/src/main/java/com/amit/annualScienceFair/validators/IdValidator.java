package com.amit.annualScienceFair.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.amit.annualScienceFair.service.UserService;

public class IdValidator implements ConstraintValidator<NotDuplicateId, Integer>{
	
	@Autowired
	private UserService userService;

	 public void initialize(NotDuplicateId notExistingId) {
	    }
	 
	    public boolean isValid(Integer id, ConstraintValidatorContext constraintValidatorContext) {
	        return !userService.doesIdExist(id);
	    }

}
