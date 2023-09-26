<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Register Portal</title>
</head>
<body>
<div align= "center">
<%
String uid= (String) session.getAttribute("user");
if(uid == null){
	%>	
	<jsp:forward page="login.jsp"/>
<% }  %>


<form action="CustomerProcess">
Customer ID  : <input type="text" name="id"><br><br>
Customer name: <input type ="text" name="name"><br><br>
       Email : <input type= "email" name= "email"><br><br>
      gender : <input type= "text" name= "gender"><br><br>
     country : <input type="text" name="country"><br><br>
     
     <input type="submit" value="Submit"> <input type ="reset">
     
     <a href="process.jsp">View Customer data</a>
     </form>
</div>
</body>
</html>