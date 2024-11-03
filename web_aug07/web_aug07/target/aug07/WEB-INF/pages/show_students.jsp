<%@page import="com.nit.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Students List</h1>
<table border="1" width="100%">
<% List<Student> students = (List<Student>)request.getAttribute("students");
	for(Student st : students){
%>
	<tr>
		<td><%=st.getStuId() %></td>
		<td><%=st.getFirstName() %></td>
		<td><%=st.getLastName() %></td>
	</tr>
<%
}
%>


</table>
</body>
</html>