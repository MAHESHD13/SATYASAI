package com.mahesh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PRODUCTINVOICESERVLET extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//client sends the requested data and get the data
		int proId = Integer.parseInt(request.getParameter("proId"));
		
		String proName = request.getParameter("proName");
		
		double proPrice = Double.parseDouble(request.getParameter("proPrice"));
		
		int proQuantity = Integer.parseInt(request.getParameter("proQuantity"));
		
		
		//processing the logics
		
		double totalBill;
		totalBill = proPrice * proQuantity;
		String discountMessage ="No Discount ";
		double discount=0;
		
		if(totalBill > 1000 && totalBill < 5000)
		{
			discount = totalBill * 0.05;
			discountMessage = "5 % discount";
		}
		else if(totalBill >= 5000 && totalBill < 10000)
		{
			discount = totalBill * 0.10;
			discountMessage ="10 % discount";
		}
		else if(totalBill > 10000)
		{
			discount =totalBill * 0.15;
			discountMessage ="15 % discount";
		}
		double finalBill = totalBill - discount;
		
		//render the response
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html><body bgcolor='aqua'>");
		writer.println("<h1>****Product Invoice****</h1>");
		writer.println("<p>Your Product Id..."+proId+"</p>");
		writer.println("<p>Your Product Name..."+proName+"</p>");
		writer.println("<p>Your Product Price..."+proPrice+"</p>");
		writer.println("<p>Total Price of "+proQuantity+" products : $"+totalBill+"</p>");
		writer.println(discountMessage+" Amount..."+discount);
		writer.println("<p>Net Amount to pay : $"+finalBill+"</p>");
		writer.println("</body></html>");
		
	}


}
