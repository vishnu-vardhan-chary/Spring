<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Calculator</h1>
	<form action="calculate">
		<table border="1">
			<tr>
				<td>Enter A :</td>
				<td><input type="number" name="first_value" /></td>
			</tr>
			<tr>
				<td>Enter B :</td>
				<td><input type="number" name="second_value" /></td>
			</tr>
			<tr>
				<td>Choose Option:</td>
				<td><select name="option">
						<option value="1">Addtion</option>
						<option value="2">Subtraction</option>
						<option value="3">Multiplication</option>
						<option value="4">Division</option>
				</select></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>