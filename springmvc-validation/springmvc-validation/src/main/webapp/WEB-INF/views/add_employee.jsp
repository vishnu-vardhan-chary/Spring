<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h1>Employee Form</h1>
<form:form action="saveEmployee" modelAttribute="employee" method="POST">
	<table>
		<tr>
			<td>Name</td>
			<td><form:input path="name"/></td>
			<td><form:errors path="name"/></td>
		</tr>
		<tr>
			<td>Address</td>
			<td><form:input path="address"/></td>
			<td><form:errors path="address"/></td>
		</tr>
		<tr>
			<td>Salary</td>
			<td><form:input path="salary"/></td>
			<td><form:errors path="salary"/></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" /></td>
		</tr>
	</table>
</form:form>
</body>
</html>