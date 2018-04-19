<%--
  Created by IntelliJ IDEA.
  User: mahim
  Date: 09-Oct-17
  Time: 9:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="mahim.DBbean" %>
<jsp:useBean id="bean" scope="session" class="mahim.DBbean"> </jsp:useBean>
<jsp:setProperty name="bean" property="location"></jsp:setProperty>

<html>
<head>
    <title>Delete Operation</title>
</head>
<body style="background-color: darkslategrey">
    <%
        try {
            bean.delete_data();%>
    <h2 style="text-align: center; color: crimson"> Data deleted Successfully! </h2>
    <%    }
        catch (Exception Ex){ %>
    <h3> Data deletion failed!</h3>
    <%    }%>
</body>
</html>
