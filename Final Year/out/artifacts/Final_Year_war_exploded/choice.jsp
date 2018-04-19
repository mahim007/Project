<%--
  Created by IntelliJ IDEA.
  User: mahim
  Date: 09-Oct-17
  Time: 2:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.lang.*" %>
<html>
<head>
    <title>Choice</title>
</head>
<body>
    <% if (request.getParameter("user_mode").equals("0")){ %> <jsp:forward page="admin_login.jsp" /> <% } %>
    <% if (request.getParameter("user_mode").equals("1")){ %> <jsp:forward page="user_panel.jsp" /> <% } %>
    <% if (request.getParameter("user_mode").equals("2")){ %> <jsp:forward page="find_distance.jsp" /> <% } %>
    <% if (request.getParameter("user_mode").equals("3")){ %> <jsp:forward page="insert_data.jsp" /> <% } %>
    <% if (request.getParameter("user_mode").equals("4")){ %> <jsp:forward page="delete_data.jsp" /> <% } %>
</body>
</html>
