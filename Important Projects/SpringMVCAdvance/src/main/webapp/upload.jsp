<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>File Upload</title>
</head>
<body>
<h3 style="color:green">${fileSuccess}</h3>
<form:form method="POST" action="saveFile" enctype="multipart/form-data">
<p><label for="image">Choose a file to upload</label></p>
<p><input type="file" name="file"></p>
<input type="submit" value="submit">
</form:form>
</body>
</html>