<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<HTML>
<head>
<link href="webjars/bootstrap/5.3.2/css/bootstrap.min.css"
	rel="stylesheet">
<title>Dashbord</title>
</head>
<body>
	<div class="container">
		<h2>your contacts :</h2>
		<table class="table">
			<thead>
				<tr>
					<th>Name</th>
					<th>Number</th>
					<th>DOB</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="contact" items="${contacts}">
					<tr>
						<td>${contact.name}</td>
						<td>${contact.mobile}</td>
						<td>${contact.date}</td>
						<td><a href="/delete-contact?id=${contact.id}"
							class="btn btn-warning">Delete</a></td>
						<td><a href="/update-contact?id=${contact.id}"
							class="btn btn-success">Update</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="add-contacts" class="btn btn-success">Add contact</a>
	</div>
	<script src="webjars/bootstrap/5.3.2/js/bootstrap.min.js"
		type="text/javascript"></script>
	<script src="webjars/jquery/3.7.1/jquery.min.js" type="text/javascript"></script>
</body>

</HTML>