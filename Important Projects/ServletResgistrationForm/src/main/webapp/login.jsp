<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>

<form action="RegistrationServlet" align="center" >

        Name: <input type="text" name="name"><br><br>
        
       Email: <input type="email" name="email"><br><br>
       
       Membership :
       
       <input type= "radio" name="membership" value= "Regular"> Regular
       <input type= "radio" name="membership" value= "Premium"> Premium
       <input type= "radio" name="membership" value= "Elite">  Elite
       <br><br>
       Subscription :
       
       <input type="checkbox" name="subs" value= "newsletter"> Newsletter
       <input type="checkbox" name="subs" value= "offer">      Offer
       <input type="checkbox" name="subs" value= "reco">       Recommendation
       <br><br>
       <input type="Submit" value="Submit">
       <input type="reset">
</form>

</body>
</html>