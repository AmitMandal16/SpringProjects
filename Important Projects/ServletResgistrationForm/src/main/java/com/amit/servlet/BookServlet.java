package com.amit.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookServlet
 */
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String bname= request.getParameter("bname");
		String authname= request.getParameter("authname");
		
		request.setAttribute("book", bname.toUpperCase());
		request.setAttribute("author", authname);
		
		RequestDispatcher rd= request.getRequestDispatcher("BookProcess");
		rd.forward(request, response);
		
	}

}
