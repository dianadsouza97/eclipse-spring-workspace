<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="processform" modelAttribute="employee">
	first Name:<form:input path="firstName" /><br/>
	Last name:<form:input path="lastName" /><br/>
	Salary:<form:input path="salary" /><br/>
	<input type="submit">

</form:form>
</body>
</html>