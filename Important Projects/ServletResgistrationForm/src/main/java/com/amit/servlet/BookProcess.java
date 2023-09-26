package com.amit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookProcess
 */
public class BookProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String bookname= (String) request.getAttribute("book");
		String authorName= (String) request.getAttribute("author");
		
		out.println("Book Information ");
		out.println("Book Name : "+bookname);
		out.println("Author Name : "+authorName);
		
		
	}

	

}
