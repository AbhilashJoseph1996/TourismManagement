<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Hotel</title>
</head>
<body style ="background-color:lightyellow;">
<div> 
<p>VIEW HOTEL</p><br>
<form action="viewhotel" method="get">
HOTEL NO:<input type="text" name="hotelNo"><br><br>
<input type="submit" value="VIEW">
</form>
</div>
<div>
<p>VIEW ALL HOTEL</p><br>
<form action="viewallhotel" method="get">
<input style="background-color:green;color:white;"type="submit" value="VIEWALL"><br><br>
</form>
<a href="home.jsp"><button style="background-color:brown;color:yellow;">back</button></a>
</div>
</body>
</html>