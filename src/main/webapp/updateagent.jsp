<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Agent</title>
</head>
<body style ="background-color:lightyellow;">
<div>
<p>UPDATE AGENT<p>
<form action="updateagent" method="get">
ID:<input type="text" name="id"><br><br>
NAME:<input type="text" name="name"><br><br>
PLACE:<input type="text" name="place"><br><br>
ROLE:<input type="text" name="role"><br><br>
SALARY:<input type="text" name="salary"><br><br>
<input style="background-color:green;color:white;"type="submit" value="UPDATE"><br><br>
</form>
<a href="home.jsp"><button style="background-color:brown;color:yellow;">back</button></a>
</div>
</body>
</html>