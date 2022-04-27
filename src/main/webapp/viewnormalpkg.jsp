<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Normal Package</title>
</head>
<body style ="background-color:lightyellow;">
<div> 
<p>VIEW NORMAL PACKAGE</p><br>
<form action="viewnormalpkg" method="get">
PKG NO:<input type="text" name="pkgNo"><br><br>
<input type="submit" value="VIEW">
</form>
</div>
<div>
<p>VIEW ALL AGENT</p><br>
<form action="viewall" method="get">
<input style="background-color:green;color:white;"type="submit" value="VIEWALL"><br><br>
</form>
<a href="home.jsp"><button style="background-color:brown;color:yellow;">back</button></a>
</div>
</body>
</html>