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
    <title>Delete Data</title>
</head>
<body style="background-color: seagreen">
<h2 style="color: cyan; size: 110px; text-align: center ">Data Deletion </h2>
<h3 style="color: darkorange; size: 60px; text-align: center "> Give location name</h3>
<h4 style="color: blue; size: 60px; text-align: center ">
    <form method="post" action="delete_operation.jsp">
        Location name:<input type="text" name="location" size="20">
        <br><br>
        <input type="submit" name="sub" value="DELETE DATA">
        <input type="reset" name="res" value="RESET">
    </form>
</h4>
</body>
</html>
