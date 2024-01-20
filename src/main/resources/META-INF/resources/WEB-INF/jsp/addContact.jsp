<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<HTML>
<head>
<link href="webjars/bootstrap/5.3.2/css/bootstrap.min.css"
	rel="stylesheet">
<title>Add Contact</title>
</head>
<body>
	<div class="container">
		<h1>Enter Your Contact Details</h1>
		<form method="post" action="add-contacts">
			<div class="mb-3">
				<label for="exampleInputName" class="form-label">Name </label> <input type="text" class="form-control" name="name"
					id="exampleInputName" aria-describedby="emailHelp">
				<div id="emailHelp" class="form-text">We'll never share your
					datails with anyone else.</div>
			</div>
			<div class="mb-3">
				<label for="exampleInputNumber" class="form-label">Mobile Number </label> <input type="number" class="form-control" name="mobile"
					id="exampleInputName">
			</div>
			<!-- <div class="mb-3">
				<label for="exampleInputNumber" class="form-label">Date of birth </label> <input type="date" class="form-control" name="date"
					id="exampleInputName">
			</div> -->
			
			<!-- <div class="mb-3 form-check">
				<input type="checkbox" class="form-check-input" id="exampleCheck1">
				<label class="form-check-label" for="exampleCheck1">Check me
					out</label>
			</div> -->
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>

	</div>
	<script src="webjars/bootstrap/5.3.2/js/bootstrap.min.js"
		type="text/javascript"></script>
	<script src="webjars/jquery/3.7.1/jquery.min.js" type="text/javascript"></script>
</body>

</HTML>