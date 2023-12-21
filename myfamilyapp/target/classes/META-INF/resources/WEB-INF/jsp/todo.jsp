<%@ include file = "common/header.jspf" %>
<%@ include file = "common/navigation.jspf" %>
<div class = "container">
<!-- Div class container centers it all -->
	<h1>Enter New Appointment Details </h1>
	<!-- form:form as a spring form tag -->
	<form:form method = "post" modelAttribute ="todo">
		<!-- path maps to the variable in the java file (todo.java bean) -->
		<!-- field set links all fields related to one element (description here) -->
		<fieldset class = "mb-3">
			<form:label path = "description">Provider/Service</form:label>
			<form:input type = "text" path = "description" required = "required"/>
			<form:errors path = "description" cssClass = "text-warning"/>
		</fieldset>
		
		<fieldset class = "mb-3">
			<form:label path = "targetDate">Date</form:label>
			<form:input type = "text" path = "targetDate" required = "required"/>
			<form:errors path = "targetDate" cssClass = "text-warning"/>
		</fieldset>
		
		<!-- hidden type means it will be removed. can set this back to "text" type to allow user input -->
		<form:input type = "hidden" path = "id"/>
		<form:input type = "hidden" path = "done"/>
		
		<input type = "submit" class = "btn btn-success"/>
	
	</form:form>
	<!-- Table class makes it pretty, centers it and makes it more like a table! -->
</div>
    <script type="text/javascript">
	    $('#targetDate').datepicker({
	        format: 'yyyy-mm-dd'
	    });
    </script>
<%@ include file = "common/footer.jspf" %>   