<%-- 
    Document   : issuebooklist
    Created on : Mar 29, 2017, 5:06:42 AM
    Author     : Shad
--%>

<%@page import="java.util.List"%>
<%@page import="comm.example.IssueBook"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Issue Table</title>
    </head>
    <body>
    <center>
        <h1>Issued BookList</h1>

        <%
            Object o = request.getAttribute("IB");
            List<IssueBook> list = (List<IssueBook>) o;
            out.println("<table border=1>");
            out.println("<tr><td><b>Member ID</b></td>"
                    + "<td><b>Book Code</b></td>"
                    + "<td><b>Book Name</b></td>"
                    + "<td><b>Issue Date</b></td>"
                    + "<td><b>Return Date</b></td></tr>");
            for (IssueBook b : list) {
                out.println("<tr><td>" + b.getId() + "</td><td>" + b.getBcode() + "</td><td>"
                        + b.getBname() + "</td><td>" + b.getIdate() + "</td><td>" + b.getRdate() + "</td></tr>");
            }
            out.println("</table>");

        %>
    </center>
</body>
</html>
