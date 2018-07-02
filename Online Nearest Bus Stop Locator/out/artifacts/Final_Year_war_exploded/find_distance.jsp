<%--
  Created by IntelliJ IDEA.
  User: mahim
  Date: 09-Oct-17
  Time: 4:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Shortest Distance Information</title>
</head>
<body style="background-color: cadetblue">
<h2 style="color: chartreuse; size: 120px; text-align: center ">Find Distance </h2>
<h3 style="color: aqua; size: 60px; text-align: center "> Input your information</h3>
<h4 style="color: blue; size: 60px; text-align: center ">
    <form method="post" action="distance_operation.jsp">
    Location: <input type="text" name="location" size="15"><br><br>
    X axis: <input type="text" name="x" size="15"><br><br>
    Y axis: <input type="text" name="y" size="15">
    <br><br>
    <input type="submit" name="sub" value="SEND DATA">
    <input type="reset" name="res" value="CLEAR DATA">
    </form>
</h4>
</body>
</html>
