<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Agent</title>
</head>
<body style ="background-color:lightyellow;">
<div> 
<p>VIEW AGENT</p>
<form action="viewagent" method="get">
ID:<input type="text" name="id"><br><br>
<input type="submit" value="VIEW">
</form>
</div>
<div>
<p>VIEW ALL AGENT</p>
<form action="viewallagent" method="get">
<input style="background-color:green;color:white;"type="submit" value="VIEWALL"><br><br>
</form>
<a href="home.jsp"><button style="background-color:brown;color:yellow;">back</button></a>
</div>
</body>
</html>