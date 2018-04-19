<%--
  Created by IntelliJ IDEA.
  User: mahim
  Date: 09-Oct-17
  Time: 3:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="mahim.DBbean" %>
<jsp:useBean id="bean" scope="session" class="mahim.DBbean"/>
<html>
<head>
    <title>User Panel</title>
</head>
<body>
    <%bean.user_jdbc();%>
    <jsp:forward page="find_distance.jsp"/>
    <%bean.getConnection().close();%>
</body>
</html>
