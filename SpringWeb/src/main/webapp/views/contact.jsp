<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">

<title>Contact Page</title>
</head>
<body>
	<hr>
	<div class="container">
		<div class="text-center">
			<h1>${tittle2 }</h1>
			<p>${tittle }</p>
		</div>
		<form class="row g-3 needs-validation" novalidate action="handler"
			method="post">
			<div class="col-md-4">
				<label for="validationCustom01" class="form-label">Name</label> <input
					name="name" type="text" class="form-control"
					id="validationCustom01" required>
				<div class="valid-feedback">Looks good!</div>
			</div>
			<div class="col-md-4">
				<label for="validationCustom02" class="form-label">Number</label> <input
					name="number" type="text" class="form-control"
					id="validationCustom02" required>
				<div class="valid-feedback">Looks good!</div>
			</div>
			<div class="col-md-4">
				<label for="validationCustomUsername" class="form-label">City</label>
				<div class="input-group has-validation">
					<input type="text" class="form-control" name="city"
						id="validationCustomUsername" aria-describedby="inputGroupPrepend"
						required>
					<div class="invalid-feedback">Please choose a username.</div>
				</div>
			</div>
			<div class="col-md-6">
				<label for="validationCustom03" class="form-label">State</label> <input
					name="state" type="text" class="form-control"
					id="validationCustom03" required>
				<div class="invalid-feedback">Please provide a valid State.</div>
			</div>
			<div class="col-12">
				<button class="btn btn-primary" type="submit">Submit form</button>
			</div>
		</form>
	</div>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
	crossorigin="anonymous"></script>

</html>