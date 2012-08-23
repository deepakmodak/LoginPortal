package com.digitalgradient.portal.db;

import java.sql.*;

import com.digitalgradient.portal.login.UserData;


public class UserAuthentication 	
{
   static Connection con = null;
   static ResultSet rs = null;  	
	
   public static UserData login(UserData user) {
	
      Statement stmt = null;    
	  String username = user.getUserName();    
      String password = user.getPassword();   
	  String searchQuery = "select * from users where username='" +username+ "' AND password='"+password+ "'";
	   try 
	   {
	      
	      con = ConnectionHandler.getConnection();
	      stmt=con.createStatement();
	      rs = stmt.executeQuery(searchQuery);	        
	      boolean present = rs.next();
		  if (!present) 
	           user.setValid(false);
	      else if (present) 
	      {
	         String RealName = rs.getString("name");
	         String location = rs.getString("location");
		     user.setRealName(RealName);
	         user.setLocation(location);
	         user.setValid(true);
	      }
	   }
	   catch (Exception ex) 
	   {
	      System.out.println(ex.getMessage());
	   } 
	   finally 
	   {
		   if (rs != null)	{
	         try {
	            rs.close();
	         } catch (Exception e) {}
	            rs = null;
	        }
		    if (stmt != null) {
	         try {
	            stmt.close();
	         } catch (Exception e) {}
	            stmt = null;
	         }
		
	      if (con != null) {
	         try {
	            con.close();
	         } catch (Exception e) {
	         }
	
	         con = null;
	      }
	   }

	   return user;
	}	
}