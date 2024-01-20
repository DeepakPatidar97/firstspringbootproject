<HTML>
<head>
<link href="webjars/bootstrap/5.3.2/css/bootstrap.min.css"
	rel="stylesheet">
<title>Login Page</title>
</head>
<body>
	<div class="container">
		<pre>${error}</pre>
		<form action="/login" method="post">
			Name :<input type="text" name="username"> <br> Password
			: <input type="text" name="password"> <br> <input
				type="submit">
		</form>
	</div>
	<script src="webjars/bootstrap/5.3.2/js/bootstrap.min.js"
		type="text/javascript"></script>
	<script src="webjars/jquery/3.7.1/jquery.min.js" type="text/javascript"></script>
</body>
</HTML>