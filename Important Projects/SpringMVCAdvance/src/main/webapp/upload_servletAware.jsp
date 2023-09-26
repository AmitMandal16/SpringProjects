<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Upload File view</title>
</head>
<body>
<form action="upload_submit" method="POST" enctype="multipart/form-data">
<p>Select a file <input type="file" name="file"></p><br><br>
             <p><input type="text" name="fileName"></p><br><br>
             
             <input type="submit" value="Upload">
             
</form>

</body>
</html>