<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<c:choose>
<c:when test="${message.equals('Fruit Successfully Deleted')}">
<p style="font-size:22px"><c:out value="${message}"/></p>
</c:when>
<c:otherwise>
<div style="position:relative;top:60px;left:500px;text-align:left;font-size: 18px">
Fruit Name :${fruit.fruitName}<br>
Fruit Id: ${fruit.fruitId }<br>
Fruit Type:${fruit.fruitType }<br>
category : ${fruit.category}<br>
region:${fruit.region }<br>
price: ${fruit.price }<br><br>
<p style="font-size:22px">${message}</p>
</div>
</c:otherwise>
</c:choose>



</body>
</html>