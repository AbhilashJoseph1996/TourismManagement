<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update User</title>
</head>
<body style ="background-color:lightyellow;">
<div>
<p>UPDATE USER<p>
<form action="updateuser" method="get">
ID:<input type="text" name="id"><br><br>
NAME:<input type="text" name="name"><br><br>
AGE:<input type="text" name="age"><br><br>
PLACE:<input type="text" name="place"><br><br>
<input style="background-color:green;color:white;"type="submit" value="UPDATE"><br><br>
</form>
<a href="home.jsp"><button style="background-color:brown;color:yellow;">back</button></a>
</div>
</body>
</html>