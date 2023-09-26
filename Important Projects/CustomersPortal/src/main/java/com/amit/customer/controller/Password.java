package com.amit.customer.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.amit.customer.dao.AuthenticationDao;

/**
 * Servlet implementation class Password
 */
public class Password extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Logger log= Logger.getLogger(Password.class.getName());
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); 
		String user= request.getParameter("uname");
		String password= request.getParameter("password");
		 
		PrintWriter out= response.getWriter();
		
		System.out.println("User name --> "+user +", Password --> "+password);
		
		if(( AuthenticationDao.validate(user.trim(), password.trim())) && (user!=null && password!=null)) {
			log.info("Validating user & Password");
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			RequestDispatcher rd= request.getRequestDispatcher("customer.jsp");
			rd.forward(request, response);
			
		}
		
		else {
			log.fine("Invalid user & Password");
			out.println("Invalid user name & password ");
			request.getRequestDispatcher("login.jsp").include(request, response);  
		}
	}
	
}
