	<%@include file="common/header.jspf" %>
	<%@include file="common/navigation.jspf" %>
	<div class="container">
		<h1 style="color: blue;">LOGIN HERE!</h1>

		<pre style="color: red">${errorMessage}</pre>

		<form class="form" method="post">
		<div class="form-group">
			Username:<input type="text" name="name"> <br><br>
			</div>
			<div class="form-group">
			Password:    <input type="password" name="password"> <br>
			 </div>
			 <br>
			<button  type="submit" class="btn btn-primary">Submit</button>

		</form>
		</div>
		<%@include file="common/footer.jspf" %>