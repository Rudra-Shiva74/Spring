<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<h1>${tittle2 }</h1>
	<p>${tittle }</p>
	<hr>
	<%
	String name = (String) request.getAttribute("name");
	int number = (int) request.getAttribute("number");
	List<String> ls = (List<String>) request.getAttribute("list");
	%>
	<h1>
		Hello ${name}
		<%=name%></h1>
	<h1>
		Number
		<%=number%></h1>
	<h1>
		Friends is
		<%
	for (String f : ls) {
	%>

		<h1><%=f%></h1>
		<%
		p

		}
		%>
	</h1>
</body>
</html>