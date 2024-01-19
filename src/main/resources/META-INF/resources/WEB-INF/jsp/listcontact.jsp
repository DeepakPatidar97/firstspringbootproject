<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<HTML>
<head>
<title>Login Page</title>
</head>
<body>
	<h1>Welcome ${username}</h1>
	<h2>your contacts : </h2>
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
			<c:forEach item="${contacts}" var="contact">
					<tr>
						<td>${contact.id}</td>
						<td>${contact.name}</td>
						<td>${contact.mobile}</td>
						<td>${contact.date}</td>
					</tr>
			</c:forEach>
		</tbody>

	</table>


</body>
</HTML>