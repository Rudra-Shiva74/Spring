<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Details</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">

</head>
<body>
	<div class="container">

		<h1 class="text-center my-4">LIST OF STUDENT</h1>
		<div>
			<a class="btn btn-danger" href="home">HOME</a>
		</div>
		<table class="table">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Name</th>
					<th scope="col">Registration No</th>
					<th scope="col">Gender</th>
					<th scope="col">Email</th>
					<th scope="col">State</th>
					<th scope="col">Birthdate</th>
					<th scope="col" colspan="2">Action</th>
				</tr>
			</thead>
			<tbody>
				<%
				int a = 1;
				%>
				<c:forEach items="${student}" var="s">
					<tr>
						<td><%=a++%></td>
						<td>${s.name}</td>
						<td>${s.regno}</td>
						<td>${s.gender}</td>
						<td>${s.email}</td>
						<td>${s.state}</td>
						<td>${s.birthdate}</td>
						<td><a href="delete?id=${s.id }">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
	crossorigin="anonymous"></script>

</html>