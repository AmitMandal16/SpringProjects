<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Submit Page</title>
</head>
<body>
<div align="center">

<h2>Your details are given below. Please check carefully.</h2>
<br><br>

<div>First name : ${register.name}</div>
     <div>Email : ${register.email}</div>
<div> No of Guests : ${register.noGuest}</div>
<div>    Gender : ${register.gender}</div>
<div>Department : ${register.department}</div>

<div>Meals opted :</div>
<c:forEach var="meals" items="${register.food}">

<li>${meals}</li>

</c:forEach>
</div>
</body>
</html>