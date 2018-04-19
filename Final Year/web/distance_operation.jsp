<%--
  Created by IntelliJ IDEA.
  User: mahim
  Date: 09-Oct-17
  Time: 10:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="mahim.DBbean" %>
<jsp:useBean id="bean" scope="session" class="mahim.DBbean"></jsp:useBean>
<jsp:setProperty name="bean" property="*"></jsp:setProperty>
<html>
<head>
    <title>Title</title>
</head>
<body style="background-color: darkslategrey">
<h3  style="color: lawngreen; text-align: center; font-size: x-large" >Nearest Bus Stop</h3>
<h4 style="color: crimson; text-align: center; font-size: x-large" >
Your Location: <%=bean.getLocation()%> <br>
X Axis:<%=bean.getX()%> Y:<%=bean.getY()%><br><br>
</h4>
<%
    bean.find_distance();
%>
<h4 style="color: cyan; text-align: center; font-size: x-large";  >
Nearest Bus Stop is: <strong><%= bean.getDestination()%></strong><br>
Distance is:<strong><%=bean.getDistance()%></strong> meter<br>
X Axis:<strong><%=bean.getXx()%> </strong>
Y Axis:<strong><%=bean.getYy()%></strong>
</h4>
</body>
</html>
