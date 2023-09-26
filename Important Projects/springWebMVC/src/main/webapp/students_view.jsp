<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

 
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 --><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Students</title>
</head>
<body>
	<h2>Mandal University Student details</h2>
	
	
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Major</th>
		</tr>
		<c:forEach var="stud" items="${studentsList}" >
			<tr>
				<td>${stud.fname}</td>
				<td>${stud.lname}</td>
				<td>${stud.major}</td>

			</tr>
		</c:forEach>
	</table>
</body>
</html>