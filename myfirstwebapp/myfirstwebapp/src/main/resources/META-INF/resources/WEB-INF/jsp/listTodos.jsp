<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>TODOs</title>
</head>
<body>
	<h1>TODO List for ${name}</h1>
	<hr>
	<div>
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Task</th>
				<th>Target Date</th>
				<th>Status</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var="todo">
			<tr>
			<td>${todo.id}</td>
			<td>${todo.description}</td>
			<td>${todo.targetDate}</td>
			<td>${todo.done}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
</body>
</html>