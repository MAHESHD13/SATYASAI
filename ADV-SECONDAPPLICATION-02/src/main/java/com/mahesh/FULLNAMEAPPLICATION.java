package com.mahesh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FULLNAMEAPPLICATION extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//client sends the  data and servlet get the data 
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		
		//processing the data
		String fullname;
		fullname = firstname+lastname;
		
		//render the response to web browser(client)
		response.setContentType("text/plain");
		PrintWriter writer=response.getWriter();
		writer.println("Your Full Name..."+fullname);
	}


}
