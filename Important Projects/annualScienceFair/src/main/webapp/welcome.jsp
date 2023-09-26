<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Welcome</title>

<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet" href="static_files/css/bootstrap.min.css">
      <style>
         body {
             padding-top: 50px;
             padding-bottom: 20px;
         }
     </style>
<link rel="stylesheet" href="static_files/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="static_files/css/main.css">

      <script src="static_files/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>

<link rel="stylesheet" href="static_files/css/style.css">

</head>

<h1 style="text-align: center">Your registration is confirmed! </h1>

<body>

	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">

				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>

				<a class="navbar-brand" href="/AnnualScienceFair/">Annual Science Fair</a>
			</div>

		</div>
	</nav>
	
	<table class="logincenter">
		<tr>
			<td><label>Student ID: </label></td>
			<td><label>${user.studentId}</label></td>
		</tr>
		<tr>
			<td><label>Name: </label></td>
			<td><label>${user.studentName}</label></td>
		</tr>
		<tr>
			<td><label>University: </label></td>
			<td><label>${user.universityName}</label></td>
		</tr>
		<tr>
			<td><label>Project area: </label></td>
			<td><label>${user.projectArea}</label></td>
		</tr>
		<tr>
			<td><label>Email: </label></td>
			<td><label>${user.email}</label></td>
		</tr>

	</table>


</body>
</html>