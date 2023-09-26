<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1 style="text-align: center">Books</h1>

<style>
    table, th, td {border: 1px solid black; padding:5px}
    table.center {margin-left:auto; margin-right:auto;}
</style>

<table class="center" style="background-color: #FEF9E7; width:50%;">
	<tr>
		<th>Book Id</th>
		<th>Author Name</th>
		<th>Book Name</th>
		<th>Number of Copies</th>
	</tr>

	<c:forEach var="book" items="${book}">
		<tr>
			<td>${book.id}</td>
			<td>${book.authorName}</td>
			<td>${book.bookName}</td>
			<td>${book.numCopies}</td>
			<td><input type=button
				onClick="location.href='editbook/${book.id}'"
				style="background-color: #85C1E9; color: black; width: 80px; height: 40px;"
				value='Edit'></td>
			<td><input type=button
				onClick="location.href='deletebook/${book.id}'"
				style="background-color: #DE1515; color: white; width: 80px; height: 40px;"
				value='Delete'></td>
		</tr>
	</c:forEach>

</table>