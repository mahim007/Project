
<%@page import="comm.example.AddBookBean"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Books</title>
    </head>
    <body>
    <center>
        <h1>Book Details</h1><br>
        
        <%
            Object g = request.getAttribute("DF");
            List<AddBookBean> list = (List<AddBookBean>) g;
            out.println("<table border=1>");
            out.println("<tr><td><b>Book Code</b></td>"
                    + "<td><b>Related Field</b></td>"
                    + "<td><b>Book Name</b></td></tr>");
            for (AddBookBean b : list) {
                out.println("<tr><td>" + b.getBkcode() + "</td><td>" + b.getBkfield() + "</td><td>" + b.getBkname() + "</td></tr>");

            }
            out.println("</table>");

        %>

    </center>
    </body>
</html>
