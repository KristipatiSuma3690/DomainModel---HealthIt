<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
                <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HealthIt</title>
</head>
<body>
<div style="position:relative;top:60px;left:500px;text-align:left">
<form action="showbyregion" method="post">
Enter Region : <input type="text" name="region">
<input type="submit" value="Submit">
</form>
</div>

</body>
</html>