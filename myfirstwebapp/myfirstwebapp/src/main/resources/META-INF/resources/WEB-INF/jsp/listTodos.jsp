	
	<%@include file="common/header.jspf" %>
	<%@include file="common/navigation.jspf" %>
	<div class="container">
	
	
	<h1>TODO List for ${name}</h1>
	<hr>
		<a href="add-todo" class="btn btn-success">Add Task</a>
		<table class="table">
			<thead>
				<tr>
					
					<th>Task</th>
					<th>Target Date</th>
					<th>Status</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						
						<td>${todo.description}</td>
						<td>${todo.targetDate}</td>
						<td>${todo.done}</td>
						<td><a href="delete-todo?id=${todo.id}" class="btn btn-danger">Delete</a></td>
						<td><a href="update-todo?id=${todo.id}" class="btn btn-warning">Update</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<%@include file="common/footer.jspf" %>