<%--
  Created by IntelliJ IDEA.
  User: mahim
  Date: 09-Oct-17
  Time: 1:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
    <style>
        img {
            display: block;
            margin: 0 auto;
        }
    </style>
</head>
<body style="background-color: darkslategrey">
<h1 align="center" style="color: orange"> Welcome to <br> Nearest BUS STOP finding service. </h1><br>
<img src="bus_stop1.jpg" alt="bus stop" style="width: 70%; height: 60%"> <br> <br>

<h3 style="color: tomato; text-align: center; font-size: x-large" > Select user Mode </h3>
<h4 style="text-align: center">
<form method="post" action="choice.jsp">
    <select name="user_mode">
        <option value="0">Admin</option>
        <option value="1">User</option>
    </select> <br><br>
    <input type="submit" name="sub" value="NEXT" >
    <input type="reset" name="res" value="RESET" >
</form>
</h4>
</body>
</html>
