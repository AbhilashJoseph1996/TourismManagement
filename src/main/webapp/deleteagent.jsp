<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Agent</title>
<style>.form{margin-left:40px;}</style>
</head>
<body style="background:lightgrey;">
<h2 style="background:lightgreen;text-align:center;color:red;">DELETE AGENT</h2>
<div class="form">
<form action="deleteagent" method="get">
ID:<input type="text" name="id"><br><br>
<input  style="background-color:green;color:white;"type="submit" value="DELETE"><br><br>
</form>
<a href="home.jsp"><button style="background-color:brown;color:yellow;">back</button></a>
</div>
</body>
</html>