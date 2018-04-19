
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Successful</title>
    </head>
    <body>
    <center>
        <h1>Registered Successful!!!</h1><br>
        <table>
            <tr>
                <td>Your User ID is "<font color="green"><bean:write name="m" property="mid"/></font>"</td>
                <td><b><u>Please remember your user id and password for login.</u></b></td>
            </tr>
        </table>
                
            <br><a href="member.jsp">Login</a>
    </center>
</body>
</html>
