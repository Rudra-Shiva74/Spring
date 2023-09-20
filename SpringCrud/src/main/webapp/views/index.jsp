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
			<h2>STUDENT REGISTRATION FORM</h2>
		</div>
		<div>
			<a class="btn btn-danger" href="viewstudent">View Student</a>
		</div>
		<form class="row g-3 needs-validation" novalidate action="handler"
			method="post">
			<div class="col-md-4">
				<label for="validationCustom01" class="form-label">Name</label> <input
					name="name" type="text"
					class="form-control border border-1 border-dark"
					id="validationCustom01" required>
				<div class="valid-feedback">Looks good!</div>
			</div>
			<div class="col-md-4">
				<label for="validationCustom02" class="form-label">Registration
					Number</label> <input type="text" name="regno"
					class="form-control border border-1 border-dark"
					id="validationCustom02" required>
				<div class="valid-feedback">Looks good!</div>
			</div>
			<div class="col-md-4">
				<label for="validationCustomUsername" class="form-label">Gender</label>
				<div class="input-group has-validation">
					<input name="gender" type="radio"
						class="border border-1 border-dark" id="validationCustomUsername"
						aria-describedby="inputGroupPrepend" value="Male" required /> <span
						class="mx-2">Male</span><input name="gender" type="radio"
						value="Female" class="border border-1 border-dark"
						id="validationCustomUsername" aria-describedby="inputGroupPrepend"
						required /><span class="mx-2">Female</span>
					<div class="invalid-feedback">Please choose a Gender.</div>
				</div>
			</div>
			<div class="col-md-6">
				<label for="validationCustom03" class="form-label">Email</label> <input
					type="email" class="form-control border border-1 border-dark"
					name="email" id="validationCustom03" required>
				<div class="invalid-feedback">Please provide a valid city.</div>
			</div>
			<div class="col-md-3">
				<label for="validationCustom04" class="form-label">State</label> <select
					name="state" class="form-select border border-1 border-dark"
					id="validationCustom04" required>
					<option selected disabled value="">Choose...</option>

					<option value="Andhra Pradesh">Andhra Pradesh</option>
					<option value="Arunachal Pradesh">Arunachal Pradesh</option>
					<option value="Assam">Assam</option>
					<option value="Bihar">Bihar</option>
					<option value="Chhattisgarh">Chhattisgarh</option>
					<option value="Goa">Goa</option>
					<option value="Gujarat">Gujarat</option>
					<option value="Haryana">Haryana</option>
					<option value="Himachal Pradesh">Himachal Pradesh</option>
					<option value="Jharkhand">Jharkhand</option>
					<option value="Karnataka">Karnataka</option>
					<option value="Kerala">Kerala</option>
					<option value="Madhya Pradesh">Madhya Pradesh</option>
					<option value="Maharashtra">Maharashtra</option>
					<option value="Manipur">Manipur</option>
					<option value="Meghalaya">Meghalaya</option>
					<option value="Mizoram">Mizoram</option>
					<option value="Nagaland">Nagaland</option>
					<option value="Odisha">Odisha</option>
					<option value="Punjab">Punjab</option>
					<option value="Rajasthan">Rajasthan</option>
					<option value="Sikkim">Sikkim</option>
					<option value="Tamil Nadu">Tamil Nadu</option>
					<option value="Telangana">Telangana</option>
					<option value="Tripura">Tripura</option>
					<option value="Uttar Pradesh">Uttar Pradesh</option>
					<option value="Uttarakhand">Uttarakhand</option>
					<option value="West Bengal">West Bengal</option>

				</select>
				<div class="invalid-feedback">Please select a valid state.</div>
			</div>
			<div class="col-md-3">
				<label for="validationCustom05" class="form-label">Birthdate</label>
				<input type="date" class="form-control  border border-1 border-dark"
					name="birthdate" id="validationCustom05" required>
				<div class="invalid-feedback">Please provide a Birth Date.</div>
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