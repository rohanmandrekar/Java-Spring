<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
	rel="stylesheet">
<title>Login</title>
</head>
<body>
	<div class="container">
		<h1 style="color: blue;">LOGIN HERE!</h1>

		<pre style="color: red">${errorMessage}</pre>

		<form class="form" method="post">
			Username:<input type="text" name="name"> <br>
			 Password:<input type="password" name="password"> <br>
				<input type="submit">

		</form>
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
		</div>
</body>
</html>