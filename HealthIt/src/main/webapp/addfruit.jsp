<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HealthIt</title>
</head>
<body>
<div style="position:relative;top:60px;left:500px;text-align:left">
<form action="addBookServlet" method="post">
Enter FruitName : <input type="text" name="fruitName"><br><br>
Enter FruitId   : <input type="text" name="fruitId"><br><br>
Enter FruitType :  <select name="fruitType">
<option value="Seed">Seed</option>
<option value="Seedless">Seedless</option></select><br><br>
Enter Category  :
<select name="category">
<option value="Local">Local</option>
<option value="Hybrid">Hybrid</option></select><br><br>
Enter region  :<input type="text" name="region"><br><br>
Enter price  :<input type="text" name="price"><br><br>

<b><input type="submit" value="Submit" style="font-size: 18px;"></b>
<b><input type="reset" value="Reset" style="font-size: 18px"></b>
</form>
</div>

</body>
</html>