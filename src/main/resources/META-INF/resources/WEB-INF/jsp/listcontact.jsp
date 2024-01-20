<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<HTML>
<head>
<title>Login Page</title>
</head>
<body>
	<h1>Welcome ${username}</h1>
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


</body>
</HTML>