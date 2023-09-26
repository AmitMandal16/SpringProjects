<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Login Page</title>

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

<h1 style="text-align: center">Login to your science fair account</h1>

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
	
	<form:form id="loginForm" modelAttribute="login" action="performLogin"
		method="post">

		<table class="logincenter">
			<tr>
				<td><form:label path="studentId">User Id: </form:label></td>
				<td><form:input path="studentId" name="studentId"
						id="studentId" /></td>
			</tr>

			<tr>
				<td><form:label path="password">Password:</form:label></td>
				<td><form:password path="password" name="password"
						id="password" /></td>
			</tr>

			<tr>
				<td></td>
				<td align="left"><form:button id="login" name="login">Login</form:button></td>
			</tr>

			<tr></tr>

			<tr>
				<td></td>
				<td>Don't have account? <a href="performRegistration">Register</a></td>
			</tr>

		</table>

		<table align="center">
			<tr>
				<td style="font-style: italic; color: red;">${message}</td>
			</tr>
		</table>

	</form:form>

</body>
</html>