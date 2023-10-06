<!-- 
<html>

<head>
<title>
Login Page
</title>
</head>

<body>
 
 
Welcome to list todo........



</body>

</html>
-->





<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<link href = "webjars/bootstrap/5.3.2/css/bootstrap.min.css" rel="stylesheet">
</head>
	<body>
	
	<%@include file= "common/navigation.jspf" %>
	
		<div class = "container">
			<h1>Your Todos</h1>
			<table class="table">
				<thead>
					<tr>
					<!-- <th>id</th> -->
						<th>Description</th>
						<th>Target Date</th>
						<th>Is Done?</th>
						<th> </th>
						<th> </th>
					</tr>
				</thead>
				<tbody>		
					<c:forEach items="${todos}" var="todo">
						<tr>
							<!--  <td>${todo.id}</td> -->
							<td>${todo.description}</td>
							<td>${todo.targetDate}</td>
							<td>${todo.done}</td>
							<td><a href = "delete-todo?id=${todo.id}" class ="btn btn-warning">Delete</a>
							<td><a href = "update-todo?id=${todo.id}" class ="btn btn-success">Update</a>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<a href = "add-todo" class="btn btn-success">Add Todo</a>
		</div>
		
		<script src ="webjars/bootstrap/5.3.2/js/bootstrap.min.js"></script>
		<script src ="webjars/jquery/3.6.0/jquery.min.js"></script>
				
	</body>
</html>   -->