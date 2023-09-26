package com.amit.customer.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amit.customer.dao.CustomerDao;
import com.amit.customer.model.Customer;

/**
 * Servlet implementation class ViewAll
 */
public class ViewAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		List<Customer> list= CustomerDao.view();
		
	    for(Customer c: list) {
	    	
	    	out.println("\n Customer name : " +c.getName());
			out.println("\n Email : " +c.getEmail());
			out.println("\n Gender : " +c.getGender());
			out.println("\n Country : " +c.getCountry());
	    	
	    	
	    }
	}

}
