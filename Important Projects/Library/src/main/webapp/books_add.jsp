<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
</head>

<body>

	<h1 style="text-align: center">Add a new book</h1>

	<form:form method="post" action="addbook" modelAttribute="book">

		<style>
    		table, th, td {border: 1px solid black; padding:10px}
   			table.center {margin-left:auto; margin-right:auto;}
		</style>

		<table class="center" style="background-color:#FEF9E7; width:30%">

			<tr>
				<td>Book ID:</td>
				<td><form:input path="id" /></td>
			</tr>

			<tr>
				<td>Book name:</td>
				<td><form:input path="bookName" /></td>
			</tr>

			<tr>
				<td>Author name:</td>
				<td><form:input path="authorName" /></td>
			</tr>

			<tr>
				<td>Number of copies:</td>
				<td><form:input path="numCopies" /></td>
			</tr>

			<tr>
				<td>
					<input type="submit"
						style="background-color: #00FFER; color: white; 
						width: 100px; height: 40px; "
						value="Add Book" />
				
				</td>
				<td></td>
			</tr>

		</table>
	</form:form>
	
</body>
</html>