<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link type="text/css" rel="stylesheet" href="css/reg.css">
</head>
<body>
<h1 style="text-align:left;color:blue;"><strong>Hello <span><%=session.getAttribute("user") %></span>!!</strong></h1>

<marquee><h1 style="text-align:center;color:red;"><strong>Welcome <span><%=session.getAttribute("user") %></span></strong></h1></marquee>

<form action="ViewUserDetails" method="get">
	<input type="submit" value="View">
</form>

<form action="logout" method="get">
	<input type="submit" value="logout">
</form><br>



</body>
</html>