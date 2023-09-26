<html>

<% int a=22; %>
<body>

<h2> Welcome to JSP Project</h2>

The value of a is <% out.println(a); %><!-- Scriptlet tag -->


<%!
//Expression Tag
String uppercase(String a){
	
	return a.toUpperCase();
}

%>
Output for the method is <%=uppercase("Amit Mandal") %> <!-- Declaration  tag -->
<a href="/jspApp/MyServlet">Click here for servlet </a>
</body>
</html>
