<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Details</title>
</head>
<body>

Please enter the Customer id or view all customer data!!.
<%
 
String uid= (String) session.getAttribute("user");
if(uid == null){
	%>	
	<jsp:forward page="login.jsp"/>
<% }  %>


<form action="View" >

Customer id : <input type="text" name="id">
<input type="submit" value="Submit">

 <a href="ViewAll">View all Customer data</a>

</form>
</body>
</html>