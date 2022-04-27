<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tourism Management</title>
<style>
button{background:green;color:white;}
.user{display:flex;padding:10px;}
.user,a{padding:0px 20px;}
.agent{display:flex;padding:10px;}
.agent,a{padding:0px 20px;}
.npkg{display:flex;padding:10px;}
.npkg,a{padding:0px 20px;}
.pkg{display:flex;padding:10px;}
.pkg,a{padding:0px 20px;}
.hotel{display:flex;padding:10px;}
.hotel,a{padding:0px 20px;}</style>
</head>
<body style="background:pink;">
<h1 style="color:blue;text-align:center;">TOURISM MANAGEMENT SYSTEM</h1>
<div class="container">
<b style="color:red;margin-left:30px;">USER DETAILS</b><br><br>
<div class="user">
<a href="adduser.jsp"><button>ADD USER</button></a><br><br>
<a href="viewuser.jsp"><button>VIEW USER</button></a><br><br>
<a href="updateuser.jsp"><button>UPDATE USER</button></a><br><br>
<a href="deleteuser.jsp"><button>DELETE USER</button></a><br><br>
</div>
<b style="color:red;margin-left:30px;">AGENT DETAILS</b><br><br>
<div class="agent">
<a href="addagent.jsp"><button>ADD AGENT</button></a><br><br>
<a href="viewagent.jsp"><button>VIEW AGENT</button></a><br><br>
<a href="updateagent.jsp"><button>UPDATE AGENT</button></a><br><br>
<a href="deleteagent.jsp"><button>DELETE AGENT</button></a><br><br>
</div>
<b style="color:red;margin-left:30px;">NORMAL PACKAGE DETAILS</b><br><br>
<div class="npkg">
<a href="addnormalpkg.jsp"><button>ADD PACKAGE</button></a><br><br>
<a href="viewnormalpkg.jsp"><button>VIEW PACKAGE</button></a><br><br>
<a href="updatenormalpkg.jsp"><button>UPDATE PACKAGE</button></a><br><br>
<a href="deletenormalpkg.jsp"><button>DELETE PACKAGE</button></a><br><br>
</div>
<b style="color:red;margin-left:30px;">PREMIUM PACKAGE DETAILS</b><br><br>
<div class="pkg">
<a href="addpremiumpkg.jsp"><button>ADD PACKAGE</button></a><br><br>
<a href="viewpremiumpkg.jsp"><button>VIEW PACKAGE</button></a><br><br>
<a href="updatepremiumpkg.jsp"><button>UPDATE PACKAGE</button></a><br><br>
<a href="deletepremiumpkg.jsp"><button>DELETE PACKAGE</button></a><br><br>
</div>
<b style="color:red;margin-left:30px;">HOTEL DETAILS</b><br><br>
<div class="hotel">
<a href="addhotel.jsp"><button>ADD HOTEL</button></a><br><br>
<a href="viewhotel.jsp"><button>VIEW HOTEL</button></a><br><br>
<a href="updatehotel.jsp"><button>UPDATE HOTEL</button></a><br><br>
<a href="deletehotel.jsp"><button>DELETE HOTEL</button></a><br><br>
</div>
</div>
</body>
</html>