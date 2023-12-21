<%@ include file = "common/header.jspf" %>
<%@ include file = "common/navigation.jspf" %>
	<div class = "container">
	<!-- Div class container centers it all -->
	<h1>Your Appointments Are </h1>
		<!-- Table class makes it pretty, centers it and makes it more like a table! -->
		<table class = "table">			
			<thead> 
				<tr>
					<th> Provider/Service</th>
					<th> Appointment Date</th>
					<th> Overdue? </th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items = "${todos}" var = "todo"> 
					<tr>
						<td>${todo.description}</td>
						<td>${todo.targetDate}</td>
						<td>${todo.done}</td>
						<td><a href = "update-todo?id=${todo.id}" class = "btn btn-success">Update</a></td>
						<td><a href = "delete-todo?id=${todo.id}" class = "btn btn-warning">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="add-todo" class="btn btn-success">Add Todo</a>
	</div>
<%@ include file = "common/footer.jspf" %>   