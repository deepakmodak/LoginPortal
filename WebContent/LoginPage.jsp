<%@ page language="java" 
    contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
          <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
		<title>Digital Gradient Login Portal</title>
		<!-- Bootstrap -->
    	<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
    	<script src="bootstrap/js/bootstrap.min.js"></script> 
		
  </head>
  <body style="background-color:#111">
      <center >
    	<div class="hero-unit" style="width:400px;">
    	<form class="form-horizontal" action="LoginServlet">
    	 <table class="table table-bordered" border="0" style="width:300px;" >
    	<thead>
    	           <img src="bootstrap/img/companyLogo.jpg" />	
    	           <td><strong>Login</strong></td>
        </thead>
        <tbody>
        <tr>
		 <td>
		  <div class="control-group">
		    <label class="control-label" >Username</label>
		    <div class="controls">
		      <input type="text" name="uname" placeholder="username">
		    </div>
		  </div>
		 </td>
		  <tr>
		  <td>
		  <div class="control-group">
		  
		    <label class="control-label" for="inputPassword">Password</label>
		    <div class="controls">
		      <input type="password" name="pass" placeholder="Password">
		    </div>
		  </div>
		  </td>
		  </tr>
		  <tr>
		  <td>
		  <div class="control-group">
		    <div class="controls">		      
		      <button type="submit" class="btn btn-primary">Sign in</button>
		    </div>
		  </div>
		  </td>
		</tr>
    	</table>
    	</form>		
    	</div>
		</center>
	</body>
</html>
