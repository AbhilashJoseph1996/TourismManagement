<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add User Package</title>
<style>.form{margin-left:40px;}</style>
</head>
<body style ="background-color:lightyellow;">
<h2 style="background:lightblue;text-align:center;color:red;">USER DETAILS</h2><br><br>
<div class="form">
<form action="adduser" method="get">
ID:<input type="text" name="id"><br><br>
NAME:<input type="text" name="name"><br><br>
AGE:<input type="text" name="age"><br><br>
PLACE:<input type="text" name="place"><br><br>
<input style="background-color:green;color:white;" type="submit" value="ADD"><br><br>
</form>
<a href="home.jsp"><button style="background-color:brown;color:yellow;">back</button></a>
</div>
</body>
</html>