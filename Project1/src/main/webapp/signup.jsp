<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="css/reg.css">

</head>
<body>
	
	<div align="center">
		<form action="Signup" method="get">
		<table>
			<th>Registration Page</th>
			
			<tr><td><input type="text" name="user" placeholder="Username" required="required"></td></tr>
			<tr><td><input type="password" name="pass" placeholder="Password" required="required"></td></tr>
			
			<tr><td><input type="email" name="email" placeholder="Email" required="required"></td></tr>
			
			<tr><td><input type="submit" value="Signup"></tr>
			<tr><td><input type="reset" value="Reset"></td></tr>
		</table>
		</form>
	</div>
	
	
	
</body>
</html>