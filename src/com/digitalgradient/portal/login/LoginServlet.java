package com.digitalgradient.portal.login;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.digitalgradient.portal.db.UserAuthentication;

public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, java.io.IOException {

		try
		{	    
		     UserData user = new UserData();
		     user.setUserName(request.getParameter("uname"));
		     user.setPassword(request.getParameter("pass"));
		
		     user = UserAuthentication.login(user);
			   		    
		     if (user.isValid())
		     {
			        
		          HttpSession session = request.getSession(true);	    
		          session.setAttribute("currentSessionUser",user); 
		          response.sendRedirect("dashBoard.jsp");     		
		     }
			        
		     else 
		          response.sendRedirect("badLogin.jsp");  
		}	
		catch (Throwable theException) 	    
		{
		     System.out.println(theException); 
		}
     }
}

