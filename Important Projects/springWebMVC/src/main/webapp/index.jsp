<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>

<h1>Welcome to the Mandal University </h1>

<form action="hello">

Enter your name: <input type="text" name="name"><br><br>

<input type="submit" value="Submit"> <br><br>

</form>


<a href="studentList">View Students</a> <br><br>
<a href="studentList/Amit">Amit Pages</a> <br><br>
<a href="studentList/Nora">Nora Page</a> <br><br>
<a href="studentList/Sakshi">Sakshi Page</a> <br><br>

</body>
</html>