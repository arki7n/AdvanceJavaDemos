<%@ page isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>List of Students</h1>


<table border="1px solid black">
	<tr>
		<td>ID</td>
		<td>Name</td>
		<td>Score</td>
		<td>City</td>
	</tr>


<c:forEach items="${data}" var="student">

	<tr>
		<td>${student.id}</td>
		<td>${student.name}</td>
		<td>${student.score}</td>
		<td>${student.city}</td>
	</tr>

<!--  <c:out value="${student}"></c:out> -->	

</c:forEach>

</table>

<a href="index">Homepage</a>


</body>
</html>