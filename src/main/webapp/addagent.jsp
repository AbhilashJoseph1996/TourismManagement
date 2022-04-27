<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Agent</title>
<style>.form{margin-left:40px;}</style>
</head>
<body style ="background-color:lightyellow;">
<h2 style="background:lightblue;text-align:center;color:red;">AGENT DETAILS</h2><br><br>
<div class="form">
<form action="addagent" method="get">

ID:<input type="text" name="id"><br><br>
NAME:<input type="text" name="name"><br><br>
PLACE:<input type="text" name="place"><br><br>
ROLE:<input type="text" name="role"><br><br>
SALARY:<input type="text" name="salary"><br><br>
<input style="background-color:green;color:white;" type="submit" value="ADD"><br><br>
</form>

<a href="home.jsp"><button style="background-color:brown;color:yellow;">back</button></a>
</div>
</body>
</html>