<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
</head>

<body>

	<h1 style="text-align: center">Are you sure you want to delete this book?</h1>

	<form:form method="post" action="delete" modelAttribute="book">

		<style>
    		table, th, td {border: 1px solid black; padding:10px}
   			table.center {margin-left:auto; margin-right:auto;}
		</style>

		<table class="center" style="background-color:#FEF9E7; width:30%">

			<form:hidden path="id" />

			<tr>
				<td>Book name:</td>
				<td>${book.bookName}</td>
			</tr>

			<tr>
				<td>Author name:</td>
				<td>${book.authorName}</td>
			</tr>

			<tr>
				<td>Number of copies:</td>
				<td>${book.numCopies}</td>
			</tr>

			<tr>
				<td>
					<input type="submit"
						style="background-color: #00FFER; color: black; 
						width: 100px; height: 40px; "
						value="Delete Book" />
				
				</td>
				<td></td>
			</tr>

		</table>
	</form:form>
	
</body>
</html>