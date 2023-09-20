<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>About</title>
</head>
<body>
<h1>${tittle2 }</h1>
	<p>${tittle }</p>
	<hr>
	<h1>This is About page</h1>
	<h1>Name : ${name }</h1>
	<h1>Time : ${time}</h1>
	${student } ${name }
	<br> -------------------------------------------------Using bean
	object Here-----------------------------------------------------------
	<br> ${user.name }${user.number }${user.city }${user.state }
</body>
</html>