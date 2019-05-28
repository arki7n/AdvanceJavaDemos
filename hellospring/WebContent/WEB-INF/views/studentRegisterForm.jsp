<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="springForm" 
uri="http://www.springframework.org/tags/form" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<H1>Registration Page</H1>
	<p><b>Use tab keys to move from one input field to the next.</b></p>
	
	<springForm:form name='registration' 
	action="registerStudent"
	modelAttribute="studentObj">
	
	
		<ul type="none">
			<li><label for="username">User Name:</label></li>
			<li><springForm:input type="text" path="username" size="12" /></li>
			
			<li><label for="password">Password:</label></li>
			<li><springForm:input type="password" path="password" size="12" /></li>
			
			<li><label for="name">Name:</label></li>
			<li><springForm:input type="text" path="name" size="50" /></li>

			<li><label for="name">Email:</label></li>
			<li><springForm:input type="text" path="email" size="50" /></li>
			
			<li><input type="submit" /></li>

	</springForm:form>




</body>
</html>