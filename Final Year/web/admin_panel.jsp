<%--
  Created by IntelliJ IDEA.
  User: mahim
  Date: 09-Oct-17
  Time: 5:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Panel</title>
</head>
<body style="background-color: darkolivegreen">
<h2 style="color: darkorange; size: 110px; text-align: center ">Admin Panel </h2>
<h3 style="color: blue; size: 60px; text-align: center "> Choose option from below</h3>
<h4 style="color: blue; size: 60px; text-align: center ">
    <form method="post" action="choice.jsp">
        <select name="user_mode">
            <option value="2">Find Distance</option>
            <option value="3">Insert Data</option>
            <option value="4">Delete Data</option>
        </select> <br><br>
        <input type="submit" name="sub" value="SUBMIT" >
        <input type="reset" name="res" value="RESET" >
    </form>
</h4>
</body>
</html>
