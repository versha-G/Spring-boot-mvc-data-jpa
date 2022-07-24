<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="2">

		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>COST</th>
			<th>MFG DATE</th>
			<th>EDIT</th>
			<th>DELETE</th>

		</tr>

		<c:forEach items="${list}" var="v">

			<tr>
				<td>${v.id}</td>
				<td>${v.name}</td>
				<td>${v.cost}</td>
				<td>${v.date}</td>
				<td><a href="editVehicle?vid=${v.id}">Edit</a></td>
				<td><a href="deleteVehicle?vid=${v.id}">Delete</a></td>
			</tr>
		</c:forEach>

	</table>
	
	<a href="/">Home</a>

</body>
</html>