
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>
    <center>
        <h1>Registration Form</h1>
        
        <html:form action="/rgtaction" method="post">
            
            <table>
                <tr>
                    <td>User Id:</td>
                    <td><html:text name="m" property="mid"/></td>
                    <td><font color="red"><html:errors property="mid"/></font></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><html:password name="m" property="mpass"/></td>
                    <td><font color="red"><html:errors property="mpass"/></font></td>
                </tr>
                <tr>
                    <td>Name:</td>
                    <td><html:text name="m" property="mname"/></td>
                    <td><font color="red"><html:errors property="mname"/></font></td>
                </tr>
                <tr>
                    <td>Address:</td>
                    <td><html:text name="m" property="maddress"/></td>
                    <td><font color="red"><html:errors property="maddress"/></font></td>
                </tr>
                <tr>
                    <td>Gender:</td>
                    <td> <html:select name="m" property="mgender">
                            <html:option value="Select">Select</html:option>
                            <html:option value="Female">Female</html:option>
                            <html:option value="Male">Male</html:option>
                            <html:option value="Others">Others</html:option></html:select></td>
                    <td><font color="red"><html:errors property="mgender"/></font></td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td><html:text name="m" property="memail"/></td>
                    <td><font color="red"><html:errors property="memail"/></font></td>
                </tr>
                <tr>
                    <td>Contact No.:</td>
                    <td><html:text name="m" property="mcontact"/></td>
                    <td><font color="red"><html:errors property="mcontact"/></font></td>
                </tr>
                <tr>
                    <td>Occupation:</td>
                    <td><html:text name="m" property="moccupation"/></td>
                    <td><font color="red"><html:errors property="moccupation"/></font></td>
                </tr>
                <tr>
                    <td><html:submit value="Submit"/></td>
                    <td><html:reset value="Clear"/></td>
                </tr>
            </table>
        </html:form>    
    </center>
</body>
</html>
