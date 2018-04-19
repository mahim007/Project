<%-- 
    Document   : regter
    Created on : Mar 26, 2017, 12:11:20 PM
    Author     : ismilerahman79
--%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Regs Page</title>
    </head>
    <body>
    <center>
        <h1>Student Registration</h1>
        <html:form action="/controller" method="post">
            <table>
                <tr>
                    <td>
                        Name
                    </td>
                    <td>
                        <html:text name="d" property="name"/>
                    </td>
                    <td>
                        <font color='red'>
                        <html:errors property="name"/>
                        </font>
                    </td>

                    <td>
                        HSC
                    </td>
                    <td>
                        RolL:<html:text name="d" property="roll1" size="15"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        Gender
                    </td>
                    <td>
                        <html:select name="d" property="gender">
                            <html:option value="male">Male</html:option>
                            <html:option value="female">Female</html:option>
                        </html:select>
                    </td>
                    <td> </td>
                    <td>
                        Year :<html:text name="d" property="year1" size="3"/>
                    </td>
                    <td>
                        GPA    :<html:text name="d" property="gpa1" size="3"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        Username 
                    </td>
                    <td>
                        <html:text name="d" property="username"/>
                    </td>
                    <td>
                        <font color='red'>
                        <html:errors property="username"/>
                        </font>
                    </td>

                    <td>
                        SSC
                    </td>
                    <td>
                        RolL:<html:text name="d" property="roll2" size="15"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        Password
                    </td>
                    <td>
                        <html:text name="d" property="password"/>
                    </td>
                    <td>
                        <font color='red'>
                        <html:errors property="password"/>
                        </font>
                    </td>

                    <td>
                        Year :<html:text name="d" property="year2" size="3"/>
                    </td>
                    <td>
                        GPA    :<html:text name="d" property="gpa2" size="3"/>
                    </td>
                </tr>
                
                <tr>
                    <td>
                        Mobile
                    </td>
                    <td>
                        <html:text name="d" property="mobile"/>
                    </td>
                    <td>
                        <font color='red'>
                        <html:errors property="mobile"/>
                        </font>
                    </td>
                    <td>
                        Payment
                    </td>
                    <td>
                        <html:text name="d" property="payno"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        Email
                    </td>
                    <td>
                        <html:text name="d" property="email"/>
                    </td>
                    <td>
                        <font color='red'>
                        <html:errors property="email"/>
                        </font>
                    </td>
                    
                </tr>
                <tr>
                    <td>
                        Address
                    </td>
                    <td>
                        <html:textarea name="d" property="address" />
                    </td>
                    <td>
                        <font color='red'>
                        <html:errors property="address"/>
                        </font>
                    </td>
                    <td> </td>
                    <td><html:submit value="Submit"/>
                        <html:reset value="Reset"/></td>

                </tr>

            </table>

        </html:form> 
    </center>
</body>
</html>
