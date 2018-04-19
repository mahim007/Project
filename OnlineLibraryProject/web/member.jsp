
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Member Login</title>
    </head>
    <body>
    <center>
        <h1>Member login!!!</h1>
        <form action="memberlogin.do" method="post">
            <table>
                <tr>
                    <td>User ID: </td>
                    <td><input type="text" name="id" required></td>
                </tr>

                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password" required></td>
                </tr>
                
                <tr>
                    <td><input type="submit" value="Login"></td>
                    <td><input type="reset" value="Clear"></td>
                </tr>
                
            </table>
        </form>
        
        <br><a href="register.jsp">Are you new?? Please Register</a>
    </center>
    
</body>
</html>
