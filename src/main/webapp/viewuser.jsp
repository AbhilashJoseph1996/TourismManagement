<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View User</title>
<style>
body{ background-color:lightgreen;} 
.container{
width:700px;
heigth:700px;
margin:auto;
background-color:grey;
border-radius:6px;}
h2{text-align:center;padding-top:15px;
color:yellow;}
form{margin-left:20px;}
form input{width:70%;padding:10px;}</style>
</head>
<body style ="background-color:lightyellow;">
<div> 
<p>VIEW USER</p>
<form action="viewuser" method="get">
ID:<input type="text" name="id"><br><br>
<input type="submit" value="VIEW"><br><br>
</form>
</div>
<div>
<p>VIEW ALL USER</p>
<form action="viewalluser" method="get">
<input style="background-color:green;color:white;"type="submit" value="VIEWALL"><br><br>
</form>
<a href="home.jsp"><button style="background-color:brown;color:yellow;">back</button></a>
</div>
</body>
</html>