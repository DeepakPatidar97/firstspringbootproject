<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<HTML>
<head>
<link href="webjars/bootstrap/5.3.2/css/bootstrap.min.css"
	rel="stylesheet">
<title>Dashbord</title>
</head>
<body>
	<h1>Welcome ${username}</h1>
	<hr>
	<h2>your contacts :</h2>
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Number</th>
				<th>DOB</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="contact" items="${contacts}">
				<tr>
					<td>${contact.id}</td>
					<td>${contact.name}</td>
					<td>${contact.mobile}</td>
					<td>${contact.date}</td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
	<script src="webjars/bootstrap/5.3.2/js/bootstrap.min.js"
		type="text/javascript"></script>
	<script src="webjars/jquery/3.7.1/jquery.min.js" type="text/javascript"></script>
</body>

</HTML>