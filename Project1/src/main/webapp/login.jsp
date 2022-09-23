<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link type="text/css" rel="stylesheet" href="css/reg.css">
</head>
<body>
	<div align="center">
		<form action="login" method="post">
		<table>
			<th>Login Page</th>
			<tr><td><input type="text" name="user" placeholder="Usename"></td></tr>
			<tr><td><input type="password" name="pass" placeholder="Password"></td></tr>
			<tr><td><input type="submit" value="Login"></tr>
			
		</table>
		<p>Don't have an account?<span><a href="signup.jsp"> Sign Up</a></span></p>
		
		</form>
	</div>
</body>
</html>