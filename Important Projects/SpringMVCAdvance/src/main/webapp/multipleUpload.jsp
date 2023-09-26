<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Multiple Upload</title>

</head>
<body>

<form action="multipleUpload_submit" method="POST" enctype="multipart/form-data">
<p>Select first file <input type="file" name="file"></p><br><br>
             <p>First file name : <input type="text" name="fileName"></p><br><br>
             
             <p>Select second file <input type="file" name="file"></p><br><br>
             <p>Second file name :<input type="text" name="fileName"></p><br><br>
             
             <p>Select third file <input type="file" name="file"></p><br><br>
             <p>Third file name :<input type="text" name="fileName"></p><br><br>
             
             <input type="submit" value="Upload">
             
</form>
</body>
</html>