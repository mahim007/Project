<%-- 
    Document   : score
    Created on : Mar 29, 2017, 11:34:58 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Score Page</h1>
        <%
        int i=(int)session.getAttribute("score");
        out.println(i);
        %>
    </body>
</html>
