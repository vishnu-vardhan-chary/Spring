<%@page import="com.nareshit.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Student st = (Student)request.getAttribute("st"); %>
	<h1>Update Student</h1>
	<form action="updateStudent" method="post">
		<input type="hidden" value="<%=st.getStuId()%>" name="stu_id" />
		<table border="1">
			<tr>
				<td>Enter First Name</td>
				<td><input type="text" name="first_name" value="<%=st.getFirstName()%>" /></td>
			</tr>
			<tr>
				<td>Enter Last Name</td>
				<td><input type="text" name="last_name"  value="<%=st.getLastName() %>" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Update Student" />
				<a href="getAllStudents">Cancel</a></td>
			</tr>
		</table>
	</form>
</body>
</html>