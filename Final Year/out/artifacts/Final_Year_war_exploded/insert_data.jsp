<%--
  Created by IntelliJ IDEA.
  User: mahim
  Date: 09-Oct-17
  Time: 4:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Isert Data</title>
</head>
<body style="background-color: cadetblue">
<h2 style="color: orange; size: 110px; text-align: center ">Store Location</h2>
<h3 style="color: lawngreen; size: 60px; text-align: center "> Fill the box</h3>
<h4 style="color: blue; size: 60px; text-align: center ">
    <form method="post" action="insert_operation.jsp">
        Location: <input type="text" name="location" size="15"><br><br>
        X Axis: <input type="text" name="x" size="15"><br><br>
        Y Axis: <input type="text" name="y" size="15">
        <br><br>
        <input type="submit" name="sub" value="INSERT DATA">
        <input type="reset" name="res" value="RESET">
    </form>
</h4>
</body>
</html>
