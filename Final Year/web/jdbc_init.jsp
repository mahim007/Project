<%--
  Created by IntelliJ IDEA.
  User: mahim
  Date: 09-Oct-17
  Time: 5:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="mahim.DBbean" %>
<jsp:useBean id="bean" scope="session" class="mahim.DBbean"></jsp:useBean>
<jsp:setProperty name="bean" property="*"></jsp:setProperty>
<html>
<head>
    <title>JDBC initiallization</title>
</head>
<body>
    <% bean.init_jdbc();%>
    <%if (bean.getConnection()==null){%>
        <h3>ERROR in information</h3>
    <% }
    else { %>
        <jsp:forward page="admin_panel.jsp"/>
    <% } %>
</body>
</html>
