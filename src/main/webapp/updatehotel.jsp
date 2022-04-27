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
<form action="updatehotel" method="get">
<p>HOTEL DETAILS</p><br><br>
HOTEL NO:<input type="text" name="hotelNo"><br><br>
HOTEL NAME:<input type="text" name="hotelName"><br><br>
HOTEL TYPE:<input type="text" name="hotelType"><br><br>
LOCATION:<input type="text" name="location"><br><br>
RATE:<input type="text" name="rate"><br><br>
<input style="background-color:green;color:white;"type="submit" value="UPDATE"><br><br>
</form>
<a href="home.jsp"><button style="background-color:brown;color:yellow;">back</button></a>
</div>
</body>
</html>