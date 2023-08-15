<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" import="com.healthit.model.*"%>
            <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HealthIt</title>
</head>
<body>
<c:forEach var="fruit" items="${fruitList }">${fruit }</c:forEach>
</body>
</html>