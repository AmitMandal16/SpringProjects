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
 * Servlet implementation class View
 */
public class View extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id= Integer.parseInt(request.getParameter("id"));
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Customer c= CustomerDao.viewEmpById(id);
		
		out.println("Customer Data is given below : ");
		
		out.println("\n Customer name : " +c.getName());
		out.println("\n Email : " +c.getEmail());
		out.println("\n Gender : " +c.getGender());
		out.println("\n Country : " +c.getCountry());
		
	 out.println("<a href='customer.jsp'>Add New Employee</a>");  
	}

}
