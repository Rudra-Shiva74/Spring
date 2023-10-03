<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Complex form</title>
</head>
<body>
	<h1>Complex form</h1>
	<div>
		<form:errors path="per.*" />
	</div>
	${per }
	<form action="formfill" method="post">
		<input type="text" placeholder="enter your name" name="name" /> <input
			type="text" placeholder="id" name="id" /> <input type="text"
			placeholder="dd/mm/yyyy" name="dob" /> <input type="text"
			placeholder="city" name="Address.city" />
		<button type="submit">Submit</button>
	</form>
</body>
</html>