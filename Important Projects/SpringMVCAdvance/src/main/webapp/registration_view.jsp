<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<div align="center">
<form:form action="submit" modelAttribute="register">

<b>Name: </b><form:input path= "name" />
<form:errors path="name"/>
<br><br>

<b>Email : </b><form:input path= "email" /><form:errors path="email"/>
<br><br>

<b>No of guests : </b><form:input path= "noGuest" /><form:errors path="noGuest"/>
<br><br>


<b>Gender: </b>      Male<form:radiobutton path= "gender" value="Male"/>
                     female<form:radiobutton path= "gender" value="Female"/>
<br><br>

<b>Department: </b> <br>
<form:select path="department">
<form:option value="Physics" label="Physics"/>
<form:option value="computerScience" label="computerScience"/>
<form:option value="Mechincal" label="Mechincal"/>
<form:option value="Civil" label="Civil"/>
</form:select>
<br><br>

<b>Food: </b> <br>
<form:checkbox path="food" value="BreakFast"/>BreakFast<br>
<form:checkbox path="food" value="Lunch"/>Lunch<br>
<form:checkbox path="food" value="BreakFast"/>Dinner<br>
<br><br>

<input type="Submit" value="Register"/>

</form:form>
</div>
</body>
</html>