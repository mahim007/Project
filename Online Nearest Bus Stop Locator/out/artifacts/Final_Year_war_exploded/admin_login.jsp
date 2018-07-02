<%--
  Created by IntelliJ IDEA.
  User: mahim
  Date: 09-Oct-17
  Time: 3:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Login</title>
</head>
<body style="background-color: mediumslateblue">
<h2 style="color: orange; size: 90px; text-align: center ">Log in as Admin </h2>
<h4 style="color: blue; size: 60px; text-align: center ">
    <form method="post" action="jdbc_init.jsp">
        DB Name: <input type="text" name="database" size="20"/><br><br>
        Username: <input type="text" name="username" size="20" /><br><br>
        Password: <input type="text" name="password" size="20" />
        <br><br>
        <input type="submit" name="sub" value="SUBMIT">
        <input type="reset" name="res" value="RESET">
    </form>
</h4>
</body>
</html>
