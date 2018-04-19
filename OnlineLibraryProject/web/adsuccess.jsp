
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrator Page</title>
    </head>
    <body>
        <h1>!!!Administrator Profile!!!</h1>                                     <html:link action="/logout">LogOut</html:link> <br>                               


        <ul>
            <li><a href="addbook.jsp">Add New Book.</a></li>
            <li><a href="issue.jsp">Issue Book.</a></li>
            <li><a href="issuebooklist.do">Issue book list</a></li>
            <li><a href="booksearch.jsp">Book Search.</a></li>

        </ul>

    </body>
</html>
