
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrator</title>
    </head>
    <body>
    <center>
        <h1>CU ONLINE LIBRARY</h1><br>
        
        <br><b>Administrator Login!!!</b><br>
        <html:form action="/adcontroller" method="post">
            <table>
                <tr>
                    <td>Administrator ID:</td>
                    <td><html:text name="a" property="id"/></td>
                    <td><font color="red"><html:errors property="id"/></font></td>
                </tr>
                <tr>
                    <td>Administrator Password:</td>
                    <td><html:password name="a" property="pass"/></td>
                    <td><font color="red"><html:errors property="pass"/></font></td>
                </tr>
                <tr>
                    <td><html:submit value="Login"/></td>
                    <td><html:reset value="Clear"/></td>
                </tr>
            
            </table>
        </html:form>
       </center> 
    </body>
</html>
