<%@page import="com.nareshit.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function deleteStudent(str) {
		if (confirm("Do you want to delete Student ?")) {
			document.frm.stu_id.value = str;
			document.frm.action = "deleteStudent";
			document.frm.submit();
		}

	}
	function editStudent(str) {
		document.frm.stu_id.value = str;
		document.frm.action = "editStudent";
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
		<h1>Students List</h1>
		<a href="showStudentPage" class="btn btn-outline-success">Add Student</a>
		<br/>
		<br/>
		<table class="table table-striped">
			<form name="frm">
				<input type="hidden" name="stu_id" />
				<%
				List<Student> students = (List<Student>) request.getAttribute("students");
				if (students.size() == 0) {
				%>
				<tr>
					<td colspan="5">No More Students here!!</td>
				</tr>
				<%
				}
				%>
				<%
				for (Student st : students) {
				%>
				<tr>
					<td><%=st.getStuId()%></td>
					<td><%=st.getFirstName()%></td>
					<td><%=st.getLastName()%></td>
					<td><input type="button" class="btn btn-outline-primary" value="Delete"
						onclick="deleteStudent('<%=st.getStuId()%>')" /></td>
					<td><input type="button" class="btn btn-outline-warning" value="Edit"
						onclick="editStudent('<%=st.getStuId()%>')" /></td>
				</tr>
				<%
				}
				%>
			</form>

		</table>
	</div>
</body>
</html>