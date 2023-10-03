<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Home</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">

</head>
<body>
	<div class="container">
		<div class="text-center mb-5">
			<h2>STUDENT LOGIN FORM</h2>
		</div>
		<div>
			<a class="btn btn-danger" href="viewstudent">Profile Page</a>
		</div>
		<form class="row g-3 needs-validation" novalidate action="Login"
			method="post">

			<div class="col-md-4">
				<label for="validationCustom02" class="form-label">Registration
					Number</label> <input type="text" name="regno"
					class="form-control border border-1 border-dark"
					id="validationCustom02" required>
				<div class="valid-feedback">Looks good!</div>
			</div>
			<div class="col-md-6">
				<label for="validationCustom03" class="form-label">Password</label>
				<input type="password"
					class="form-control border border-1 border-dark" name="password"
					id="validationCustom03" required>
				<div class="invalid-feedback">Please provide a valid Password.</div>
			</div>
			<div class="col-12">
				<button class="btn btn-primary" type="submit">Submit form</button>
			</div>
		</form>
	</div>

</body>
<script>
    (() => {
        'use strict'

        // Fetch all the forms we want to apply custom Bootstrap validation styles to
        const forms = document.querySelectorAll('.needs-validation')

        // Loop over them and prevent submission
        Array.from(forms).forEach(form => {
            form.addEventListener('submit', event => {
                if (!form.checkValidity()) {
                    event.preventDefault()
                    event.stopPropagation()
                }

                form.classList.add('was-validated')
            }, false)
        })
    })()
</script>
</html>