package com.amit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
//@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name= request.getParameter("name");
		String email= request.getParameter("email");
		String mship= request.getParameter("membership");
		String[] subs= request.getParameterValues("subs");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<br><br> Name : " +name);
		
		out.println("<br><br> Email : " +email);
		
		out.println("<br><br> MemberShip : " +mship);
		
		for(String s: subs) {
			
			out.println("<br><br> MemberShip : " +s);
		}
	}

}
