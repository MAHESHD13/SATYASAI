package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LOGINPAGE extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//get the data from client
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//process the data
		if(username.equalsIgnoreCase("ratan") && password.equals("Ratan@123"))
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("success.html");
			dispatcher.forward(request, response);
		}
		else
		{
			response.setContentType("text/html");
			PrintWriter writer=response.getWriter();
			writer.println("Login Fail...try with valid data");
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
			dispatcher.include(request, response);
		}
		
	}

	
}
