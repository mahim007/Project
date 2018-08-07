<%--
  Created by IntelliJ IDEA.
  User: mahim
  Date: 04-Aug-18
  Time: 11:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Enter Studnt Information</title>
</head>
<body>
    <form style="color: blueviolet; alignment: center; font: bold" action="/addStudent" method="post">
        <fieldset>
            <legend><h2>Student Registration</h2></legend>
            ID: <input type="text" name="id"><br><br>
            Name: <input type="text" name="name" ><br><br>
            Age: <input type="text" name="age"><br><br>
            Lang: <input type="text" name="lang"><br><br>

            <input type="submit">
            <input type="reset">
        </fieldset>
    </form>

    <form style="color: crimson; font: bold; alignment: right" action="/getStudent" method="get">
        <fieldset>
            <legend><h2>Student Information</h2></legend>
            ID: <input type="text" name="id">
            <input type="submit">
        </fieldset>
    </form>

    <form style="color: blue; alignment: center; font: bold" action="/getUpdateStudent" method="get">
        <fieldset>
            <legend><h2>Update Student</h2></legend>
            ID: <input type="text" name="id">
            <input type="submit">
        </fieldset>
    </form>

    <form style="color: aqua; alignment: center; font: bold" action="/deleteStudent" method="get">
        <fieldset>
            <legend><h2>Delete Student</h2></legend>
            ID: <input type="text" name="id">
            <input type="submit">
        </fieldset>
    </form>

</body>
</html>
