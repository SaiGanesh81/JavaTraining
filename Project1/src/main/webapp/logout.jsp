<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>

</head>
<body>

<h1 style="text-align:center;color:green;"><strong><span><%=session.getAttribute("user") %></span> logged out successfully </strong></h1>
<h1><a href="login.jsp">Login</a></h1>


</body>
</html>