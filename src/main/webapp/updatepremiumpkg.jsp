<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Premium Package</title>
</head>
<body style ="background-color:lightyellow;">
<div>
<form action="updatepremiumpkg" method="get">
<p>PREMIUM PACKAGE DETAILS</p><br><br>
PKG NO:<input type="text" name="pkgNo"><br><br>
PKG TYPE:<input type="text" name="pkgType"><br><br>
DESTINATION1:<input type="text" name="destination1"><br><br>
DESTINATION2:<input type="text" name="destination2"><br><br>
DESTINATION3:<input type="text" name="destination3"><br><br>
DAY:<input type="text" name="duration"><br><br>
NIGHT:<input type="text" name="duration"><br><br>
PRICE:<input type="text" name="price"><br><br>
<input style="background-color:green;color:white;"type="submit" value="UPDATE"><br><br>
</form>
<a href="home.jsp"><button style="background-color:brown;color:yellow;">back</button></a>
</div>
</body>
</html>