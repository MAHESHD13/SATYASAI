package com.adv.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//total 6-details = 4-details session 2-request 
		HttpSession session = request.getSession(false);
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("User Name..."+session.getAttribute("username"));
		writer.println("<br>");
		writer.println("User Age..."+session.getAttribute("age"));
		writer.println("<br>");
		writer.println("User Qualification..."+session.getAttribute("qualification"));
		writer.println("<br>");
		writer.println("User Designation..."+session.getAttribute("designation"));
		writer.println("<br>");
		writer.println("User Mobile..."+request.getParameter("mobile"));
		writer.println("<br>");
		writer.println("User Email..."+request.getParameter("email"));
	
	}
}
