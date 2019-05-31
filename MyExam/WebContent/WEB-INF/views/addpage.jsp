<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>Welcome to Student Management System</h1>


<div>


<form:form action="addrecord" modelAttribute="student">
				<table class="table">
				
					
					<tr>
						<td>
							<form:label path="name">
								<spring:message text="Student Name" />
							</form:label></td>
						<td>
							<form:input path="name" /> 
							<form:errors path="name" cssClass="errors"></form:errors>
						</td>
					</tr>
					<tr>
						<td><form:label path="city">
								<spring:message text="City Name" />
							</form:label>
						</td>
						<td><form:input path="city" /> <form:errors path="city" cssClass="errors">
							</form:errors>
						</td>
					</tr>
					
					<tr>
						<td><form:label path="score">
								<spring:message text="Score" />
							</form:label>
						</td>
						<td><form:input path="score" /> <form:errors path="score" cssClass="errors">
							</form:errors>
						</td>
					</tr>
					

				</table>
				
				<input type="submit" class="btn btn-primary" value="<spring:message text="Add Student"/>" />
				
			</form:form>


</div>

<a href="index">Homepage</a>



</body>
</html>