<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="CustomerController" method="post">

	<input type="hidden" name="customerId" placeholder="customerId"><br>
	<input type="text" name="firstName" placeholder="firstname"><br>
	<input type="text" name="lastName" placeholder="lastname"><br>
	<input type="text" name="mobileNo" placeholder="mobileno"><br>
	<input type="text" name="email" placeholder="email"><br>
	<input type="submit" name="submit" value="Add Customer"><br>
	
</form>
</body>
</html>