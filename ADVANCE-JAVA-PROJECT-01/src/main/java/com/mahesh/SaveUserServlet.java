package com.mahesh;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SaveUserServlet")
public class SaveUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//get the data
		String userId = request.getParameter("userId");
		String userName = request.getParameter("userName");
		String userEmail = request.getParameter("userEmail");
		String userMobile = request.getParameter("userMobile");
		String userLocation = request.getParameter("userLocation");
				
		/*// Calling the Dao Method 
		UserDao userDao = new UserDao();
		userDao.saveUser(userId,userName,userEmail,userMobile,userLocation);
				
		//Response 
		PrintWriter writer = response.getWriter();
		writer.println("Data Inserted Successfully.....");
		*/
				User user=new User();
				user.setUserId(userId);
				user.setUserName(userName);
				user.setUserEmail(userEmail);
				user.setUserMobile(userMobile);
				user.setUserLocation(userLocation);
			
				//calling the Dao Method by passing Servlet data
				UserDao userDao = new UserDao();
				int result = userDao.saveUser(user);
				
				//set the data into request object to use in jsp
				request.setAttribute("saveResult", result);
				//forward the request to JSP file
				RequestDispatcher dispatcher = request.getRequestDispatcher("savestatus.jsp");
				dispatcher.forward(request, response);
				
		}

}
