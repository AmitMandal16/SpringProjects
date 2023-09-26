package com.amit.customer.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amit.customer.dao.CustomerDao;
import com.amit.customer.model.Customer;

/**
 * Servlet implementation class CustomerProcess
 */
public class CustomerProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name= request.getParameter("name");
		String email= request.getParameter("email");
		String gender= request.getParameter("gender");
		String country= request.getParameter("country");
	
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		Customer cus= new Customer();
		cus.setId(id);
		cus.setName(name);
		cus.setEmail(email);
		cus.setGender(gender);
		cus.setCountry(country);
		
		int status= CustomerDao.save(cus);
		
		if(status >0) {
			
			out.println("**********Customer saved successfully*********");
			request.getRequestDispatcher("customer.jsp").include(request, response);
			//request.getRequestDispatcher("process.jsp").forward(request, response);
			
		}
		
		else {
			
			out.println("**********Error in saving Customer data*********");
			request.getRequestDispatcher("customer.jsp").include(request, response);
			
		}
		
	}

}
