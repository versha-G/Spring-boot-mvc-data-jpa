<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.error {
	color: red;
}
</style>
</head>
<body>

	<form:form method="post" action="addVehicle" modelAttribute="vehicle">

Enter name: <form:input path="name" />
		<form:errors path="name" cssClass="error" />
		<br>
Enter Cost: <form:input path="cost" />
		<form:errors path="cost" cssClass="error"/>
		<br>
Enter Mfg Date: <form:input path="date" />
		<form:errors path="date" cssClass="error"/>
		<br>
		<input type="submit" value="Add">

	</form:form>

</body>
</html>