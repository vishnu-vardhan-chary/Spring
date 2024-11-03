<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add Student</h1>
	<form action="saveStudent" method="post">
		<table border="1">
			<tr>
				<td>Enter First Name</td>
				<td><input type="text" name="first_name" /></td>
			</tr>
			<tr>
				<td>Enter Last Name</td>
				<td><input type="text" name="last_name" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Save Student" />
				<a href="getAllStudents">Cancel</a></td>
			</tr>
		</table>
	</form>
</body>
</html>