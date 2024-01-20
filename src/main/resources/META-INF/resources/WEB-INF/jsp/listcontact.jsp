
<%@ include file="common/navigation.jspf" %>
<%@ include file="common/header.jspf" %>

	<div class="container">
		<h2>Your Contacts :</h2>
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
	<a href="/add-contacts" class="btn btn-success">Add Contact</a>
<%@ include file="common/footer.jspf" %>
</body>

</HTML>