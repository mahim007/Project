<%--
  Created by IntelliJ IDEA.
  User: mahim
  Date: 09-Oct-17
  Time: 9:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="mahim.DBbean" %>
<jsp:useBean id="bean" scope="session" class="mahim.DBbean"></jsp:useBean>
<jsp:setProperty name="bean" property="*"></jsp:setProperty>
<html>
<head >
    <title>Insert Result</title>
</head>
<body style="background-color: mediumslateblue">
    <% try {
        bean.insert_data(); %>
    <h2 style="text-align: center; color: cyan"> Data Inserted Successfully! </h2>
    <%}
    catch (Exception ex){ %>
    <h2 style="text-align: center; color: cyan"> Failed to insert data! </h2>
    <%} %>
</body>
</html>
