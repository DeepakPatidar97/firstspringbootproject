<%@ include file="common/navigation.jspf" %>
<%@ include file="common/header.jspf" %>
	<div class="container">
		<pre>${error}</pre>
		<form action="/login" method="post">
			Name :<input type="text" name="username"> <br> Password
			: <input type="text" name="password"> <br> <input
				type="submit">
		</form>
	</div>
	<%@ include file="common/footer.jspf" %>
