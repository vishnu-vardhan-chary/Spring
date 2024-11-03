<%@page import="com.nit.entity.Employee"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EMS</title>
<script type="text/javascript">
	function deleteEmployee(id) {
		if (confirm("Do you want to delete ?")) {
			document.frm.id.value = id;
			document.frm.method = "POST";
			document.frm.action = "deleteEmployee";
			document.frm.submit();
		}
	}
	function editEmployee(id) {
		document.frm.id.value = id;
		document.frm.method = "POST";
		document.frm.action = "editEmployee";
		document.frm.submit();
	}
</script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Employee List</h1>
		<a class="btn btn-info" href="addEmployee">Add Employee</a> 
		<br /><br />
		<form name="frm">
			<input type="hidden" name="id" />
			<table class="table table-striped-columns">
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Address</th>
					<th>Salary</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
				<%
				List<Employee> emps = (List<Employee>) request.getAttribute("emps");
				if (emps.isEmpty()) {
				%>

				<tr>
					<td colspan="4">No Employees found!!</td>
				</tr>


				<%
				}
				for (Employee emp : emps) {
				%>
				<tr>
					<td><%=emp.getId()%></td>
					<td><%=emp.getName()%></td>
					<td><%=emp.getAddress()%></td>
					<td><%=emp.getSalary()%></td>
					<td><button class="btn btn-primary"
							onClick="editEmployee('<%=emp.getId()%>')">Edit</button></td>
					<td><button class="btn btn-warning"
							onClick="deleteEmployee('<%=emp.getId()%>')">Delete</button></td>
				</tr>
				<%
				}
				%>
			</table>
		</form>
	</div>
</body>
</html>